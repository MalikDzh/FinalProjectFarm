import java.util.*;

class Farm {
    private List<Animal> animals = new ArrayList<>();
    private Map<ProductType, Integer> storage = new HashMap<>();
    private int balance = 10000;

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void addProductToStorage(ProductType productType, int quantity) {
        storage.put(productType, storage.getOrDefault(productType, 0) + quantity);
    }

    public void sellProduct(ProductType productType) {
        int quantity = storage.getOrDefault(productType, 0);
        if (quantity > 0) {
            int price = MArketService.getPriductPrice(productType);
            balance += price * quantity;
            storage.put(productType, 0);
        } else {
            System.out.println("Нет продукции для продажи");
        }
    }

    public void feedAnimals(FeedType feedType) {

    }


}
