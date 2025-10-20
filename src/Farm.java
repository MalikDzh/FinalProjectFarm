//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.HashMap;
//import java.util.Map;
//
//class Farm {
//    private List<Animal> animals = new ArrayList<>();
//    private Map<ProductType, Integer> storage = new HashMap<>();
//    private int balance = 10000;
//    private Map<FeedType, Integer> feedStorage = new HashMap<>();
//
//    public void addAnimal(Animal animal) {
//        animals.add(animal);
//    }
//
//    public void addProductToStorage(ProductType productType, int quantity) {
//        storage.put(productType, storage.getOrDefault(productType, 0) + quantity);
//    }
//
//    public void sellProduct(ProductType productType) {
//        int quantity = storage.getOrDefault(productType, 0);
//        if (quantity > 0) {
//            int price = MarketService.getProductPrice(productType);
//            balance += price * quantity;
//            storage.put(productType, 0);
//        } else {
//            System.out.println("Нет продукции для продажи");
//        }
//    }
//
//    public void feedAnimals(FeedType feedType) {
//        for (Animal animal : animals) {
//            animal.feed(feedType);
//        }
//    }
//
//    public void collectionProducts() {
//        for (Animal animal : animals) {
//            ProductBundle product = animal.produce();
//            addProductToStorage(product.getProductType(), product.getQuantity());
//        }
//    }
//
//    public void buyFeed(FeedType type, int amount) {
//        if (amount <= 0) {
//            System.out.println("Количество должно быть больше нуля!");
//            return;
//        }
//
//        int pricePerUnit = 50; // цена за единицу корма (можно вынести в MarketService)
//        int totalCost = pricePerUnit * amount;
//
//        if (balance < totalCost) {
//            System.out.println("Недостаточно денег для покупки корма!");
//            return;
//        }
//
//        balance -= totalCost;
//        feedStorage.put(type, feedStorage.getOrDefault(type, 0) + amount);
//
//        System.out.println("Куплено " + amount + " ед. корма " + type +
//                " на сумму " + totalCost + " сом");
//    }
//
//    public Map<FeedType, Integer> getFeedStorage() {
//        return feedStorage;
//    }
//
//    public void feedAll(FeedType type) {
//        if (animals.isEmpty()) {
//            System.out.println("Животных нет");
//            return;
//        }
//
//        int available = feedStorage.getOrDefault(type, 0);
//        if (available < animals.size()) {
//            System.out.println("Недостаточно корма!");
//            return;
//        }
//
//        for (Animal a : animals) {
//            a.feed(type);
//        }
//
//        feedStorage.put(type, available - animals.size());
//        System.out.println("Все животные накормлены кормом " + type);
//    }
//
//    public void showFarm() {
//        System.out.println("Баланс: " + balance + " сом");
//        System.out.println("Животные:");
//        for (Animal animal : animals) {
//            System.out.println("- " + animal.getName() + ", " + animal.getAge() + " лет, голод: " + animal.getHungerLevel());
//        }
//        System.out.println("Продукция на складе:");
//        for (Map.Entry<ProductType, Integer> entry : storage.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//    }
//
////    public int getBalance() {
////        return balance;
////    }
//
//    public void report() {
//        System.out.println("--- ОТЧЁТ ПО ФЕРМЕ ---");
//
//        Map<AnimalType, Long> byType = animals.stream()
//                .collect(Collectors.groupingBy(a -> a.getType(), Collectors.counting()));
//        System.out.println("Животных по видам: " + byType);
//
//        List<String> sortedByAge = animals.stream()
//                .sorted(Comparator.comparingInt(a -> a.age))
//                .map(a -> a.name + " (" + a.age + ")")
//                .collect(Collectors.toList());
//        System.out.println("По возрасту: " + sortedByAge);
//
//        int total = storage.values().stream()
//                .mapToInt(i -> i)
//                .sum();
//        System.out.println("Общий объём продукции: " + total);
//
//        Optional<Map.Entry<ProductType, Integer>> topProduct = storage.entrySet().stream()
//                .max(Map.Entry.comparingByValue());
//        topProduct.ifPresent(e ->
//                System.out.println("Топ продукт: " + e.getKey() + " (" + e.getValue() + ")"));
//    }
//
//
//
//}


import java.util.*;
import java.util.stream.Collectors;

public class Farm {
    private List<Animal> animals = new ArrayList<>();
    private Map<ProductType, Integer> storage = new HashMap<>();
    private int balance = 10_000;
    private MarketService market = new MarketService();

    public void addAnimal(AnimalType type, String name, int age) {
        Animal animal = switch (type) {
            case COW -> new Cow(name, age);
            case CHICKEN -> new Chicken(name, age);
            case SHEEP -> new Sheep(name, age);
        };
        animals.add(animal);
        balance -= market.getAnimalPrice(type);
    }

    public void feedAll(FeedType feedType) {
        for (Animal a : animals) {
            a.feed(feedType);
        }
        balance -= market.getFeedPrice(feedType);
    }

    public void collectProducts() {
        for (Animal a : animals) {
            ProductBundle product = a.produce();
            for (Map.Entry<ProductType, Integer> entry : product.getProducts().entrySet()) {
                ProductType type = entry.getKey();
                int count = entry.getValue();
                storage.put(type, storage.getOrDefault(type, 0) + count);
            }
        }
    }

    public void sellAll() {
        for (Map.Entry<ProductType, Integer> entry : storage.entrySet()) {
            int price = market.getProductPrice(entry.getKey());
            balance += price * entry.getValue();
        }
        storage.clear();
    }

    public void showFarm() {
        System.out.println("--- Состояние фермы ---");
        System.out.println("Баланс: " + balance + " сом");
        System.out.println("Животные:");
        animals.forEach(System.out::println);
        System.out.println("Склад: " + storage);
    }

    public void report() {
        System.out.println("--- Отчёты ---");
        System.out.println("Животные по видам:");
        animals.stream()
                .collect(Collectors.groupingBy(Animal::getType, Collectors.counting()))
                .forEach((type, count) -> System.out.println(type + ": " + count));

        System.out.println("Имена по возрасту:");
        animals.stream()
                .sorted(Comparator.comparingInt(a -> a.age))
                .map(a -> a.name + " (" + a.age + ")")
                .forEach(System.out::println);

        System.out.println("Топ-1 продукт на складе:");
        storage.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(e -> System.out.println(e.getKey() + " (" + e.getValue() + ")"));
    }
}
