//import java.util.Scanner;
//
//public class Main {
//    private static final Scanner scanner = new Scanner(System.in);
//    private static final Farm farm = new Farm();
//
//    public static void main(String[] args) {
//
//
//        boolean running = true;
//        while (running) {
//            System.out.println("""
//                    --- Меню фермы ---
//                    1 - Показать ферму
//                    2 - Добавить животное
//                    3 - Купить корм
//                    4 - Кормить животных
//                    5 - Собрать продукцию
//                    6 - Продать продукцию
//                    7 - Отчеты
//                    0 - Выход
//                    """);
//            System.out.println("Выберите действие: ");
//            String input = scanner.nextLine();
//
//            try {
//                switch (input) {
//                    case "1" -> farm.showFarm();
//                    case "2" -> addAnimal();
//                    case "3" -> buyFeed();
//                    case "4" -> feedAnimals();
//                    case "5" -> farm.collectionProducts();
//                    case "6" -> sellProduct();
//                    case "7" -> farm.report();
//                    case "0" -> running = false;
//                    default -> System.out.println("Неверный выбор");
//                }
//            } catch (Exception e) {
//                System.out.println("Ошибка: " + e.getMessage());
//            }
//        }
//        System.out.println("Завершение");
//    }
//
//    private static void addAnimal() {
//        System.out.println("Введите вид животного (1 - Корова, 2 - Курица, 3 - Овца): ");
//        String type = scanner.nextLine();
//        System.out.println("Введите имя: ");
//        String name = scanner.nextLine();
//        System.out.println("Введите возраст: ");
//        int age = Integer.parseInt(scanner.nextLine());
//
//        switch (type) {
//            case "1" -> farm.addAnimal(new Cow(name, age));
//            case "2" -> farm.addAnimal(new Chicken(name, age));
//            case "3" -> farm.addAnimal(new Sheep(name, age));
//            default -> System.out.println("Неверный тип!");
//        }
//    }
//
//    private static void buyFeed() {
//        System.out.println("Введите тип корма (1 - HAY, 2- GRAIN): ");
//        String type = scanner.nextLine();
//        System.out.println("Колличество: ");
//        int amount = Integer.parseInt(scanner.nextLine());
//
//        if (type.equals("1")) farm.buyFeed(FeedType.HAY, amount);
//        else if (type.equals("2")) farm.buyFeed(FeedType.GRAIN, amount);
//        else System.out.println("Неверный выбор!");
//    }
//
//    private static void feedAnimals() {
//        System.out.print("Введите тип корма (1 - HAY, 2 - GRAIN): ");
//        String type = scanner.nextLine();
//        if (type.equals("1")) farm.feedAnimals(FeedType.HAY);
//        else if (type.equals("2")) farm.feedAnimals(FeedType.GRAIN);
//        else System.out.println("Неверный выбор!");
//    }
//
//    private static void sellProduct() {
//        System.out.print("Введите продукт (1 - MILK, 2 - EGG, 3 - WOOL): ");
//        String type = scanner.nextLine();
//        switch (type) {
//            case "1" -> farm.sellProduct(ProductType.MILK);
//            case "2" -> farm.sellProduct(ProductType.EGG);
//            case "3" -> farm.sellProduct(ProductType.WOOL);
//            default -> System.out.println("Неверный выбор!");
//        }
//    }
//}
//
////public class Main {
////    private static Scanner scanner = new Scanner(System.in);
////    private static final Farm farm = new Farm();
//
////    public static void main(String[] args) {
////    boolean running = true;
////    while (running) {
////        showMenu();
////        try {
////            int choice = Integer.parseInt(scanner.nextLine());
////            switch (choice) {
////                case 1:
////                    farm.showFarmStatus();
////                    break;
////                    case 2:
////                        addAnimal();
////                        break;
////                        case 3:
////                            buyFeed();
////                            break;
////                            case 4:
////                                feedAnimal();
////                                break;
////                                case 5:
////                                    farm.collectProducts();
////                                    break;
////                                    case 6:
////                                        sellProducts();
////                                        break;
////                                        case 7:
////                                            showReports();
////                                            break;
////                                            case 0:
////                                                running = false;
////                                                break;
////                                                default:
////                                                    System.out.println("Неверный выбор");
////            }
////        } catch (NumberFormatException e) {
////            System.out.println("Ошибка ввода. Введите число");
////        }
////    }
////    }
////
////    private static void showMenu() {
////        System.out.println("1 — Показать ферму");
////        System.out.println("2 — Добавить животное");
////        System.out.println("3 — Купить корм");
////        System.out.println("4 — Кормить животных");
////        System.out.println("5 — Собрать продукцию");
////        System.out.println("6 — Продать продукцию");
////        System.out.println("7 — Отчёты");
////        System.out.println("0 — Выход");
////    }
////
////    private static void addAnimal() {
////        System.out.println("Выберите животное (COW, CHICKEN, SHEEP):");
////        String animalType = scanner.nextLine().toUpperCase();
////        System.out.println("Введите имя животного:");
////        String name = scanner.nextLine();
////        System.out.println("Введите возраст животного:");
////        int age = Integer.parseInt(scanner.nextLine());
////
////        switch (animalType) {
////            case "COW":
////                farm.addAnimal(new Cow(name, age));
////                break;
////            case "CHICKEN":
////                farm.addAnimal(new Chicken(name, age));
////                break;
////            case "SHEEP":
////                farm.addAnimal(new Sheep(name, age));
////                break;
////            default:
////                System.out.println("Неверный выбор животного.");
////        }
////
////        private static void buyFeed() {
////            System.out.println("Выберите корм (HAY, GRAIN):");
////            String feedType = scanner.nextLine().toUpperCase();
////            System.out.println("Введите количество корма:");
////            int quantity = Integer.parse
////}
//
////    boolean running = true;
////
////        while (running) {
////        System.out.println("""
////                === Меню фермы ===
////                1 - Показать ферму
////                2 - Добавить животное
////                3 - Купить корм
////                4 - Кормить животных
////                5 - Собрать продукцию
////                6 - Продать продукцию
////                7 - Отчёты
////                0 - Выход
////                """);
////        System.out.print("Выберите действие: ");
////        String input = scanner.nextLine();
////
////        try {
////            switch (input) {
////                case "1" -> farm.showFarm();
////                case "2" -> addAnimal();
////                case "3" -> buyFeed();
////                case "4" -> feedAnimals();
////                case "5" -> farm.collectProducts();
////                case "6" -> sellProduct();
////                case "7" -> farm.report();
////                case "0" -> running = false;
////                default -> System.out.println("Неверный выбор!");
////            }
////        } catch (Exception e) {
////            System.out.println("Ошибка: " + e.getMessage());
////        }
////    }
////        System.out.println("Игра завершена!");
////}
////
////private static void addAnimal() {
////    System.out.print("Введите тип животного (1 - Корова, 2 - Курица, 3 - Овца): ");
////    String type = scanner.nextLine();
////    System.out.print("Введите имя: ");
////    String name = scanner.nextLine();
////    System.out.print("Введите возраст: ");
////    int age = Integer.parseInt(scanner.nextLine());
////
////    switch (type) {
////        case "1" -> farm.addAnimal(new Cow(name, age));
////        case "2" -> farm.addAnimal(new Chicken(name, age));
////        case "3" -> farm.addAnimal(new Sheep(name, age));
////        default -> System.out.println("Неверный тип!");
////    }
////}
////
////private static void buyFeed() {
////    System.out.print("Введите тип корма (1 - HAY, 2 - GRAIN): ");
////    String type = scanner.nextLine();
////    System.out.print("Количество: ");
////    int amount = Integer.parseInt(scanner.nextLine());
////
////    if (type.equals("1")) farm.buyFeed(FeedType.HAY, amount);
////    else if (type.equals("2")) farm.buyFeed(FeedType.GRAIN, amount);
////    else System.out.println("Неверный выбор!");
////}
////
////private static void feedAnimals() {
////    System.out.print("Введите тип корма (1 - HAY, 2 - GRAIN): ");
////    String type = scanner.nextLine();
////    if (type.equals("1")) farm.feedAnimals(FeedType.HAY);
////    else if (type.equals("2")) farm.feedAnimals(FeedType.GRAIN);
////    else System.out.println("Неверный выбор!");
////}
////
////private static void sellProduct() {
////    System.out.print("Введите продукт (1 - MILK, 2 - EGG, 3 - WOOL): ");
////    String type = scanner.nextLine();
////    switch (type) {
////        case "1" -> farm.sellProduct(ProductType.MILK);
////        case "2" -> farm.sellProduct(ProductType.EGG);
////        case "3" -> farm.sellProduct(ProductType.WOOL);
////        default -> System.out.println("Неверный выбор!");
////    }
////}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Farm farm = new Farm();
        boolean running = true;

        while (running) {
            System.out.println("""
                    --- Меню ---
                    1 - Показать ферму
                    2 - Добавить животное
                    3 - Купить корм
                    4 - Кормить животных
                    5 - Собрать продукцию
                    6 - Продать продукцию
                    7 - Отчёты
                    0 - Выход
                    """);

            System.out.print("Выбор: ");
            String input = sc.nextLine();

            try {
                switch (input) {
                    case "1" -> farm.showFarm();
                    case "2" -> {
                        System.out.print("Вид (1-Корова, 2-Курица, 3-Овца): ");
                        int t = Integer.parseInt(sc.nextLine());
                        AnimalType type = switch (t) {
                            case 1 -> AnimalType.COW;
                            case 2 -> AnimalType.CHICKEN;
                            case 3 -> AnimalType.SHEEP;
                            default -> throw new IllegalArgumentException("Неверный вид");
                        };
                        System.out.print("Имя: ");
                        String name = sc.nextLine();
                        System.out.print("Возраст: ");
                        int age = Integer.parseInt(sc.nextLine());
                        farm.addAnimal(type, name, age);
                    }
                    case "3" -> System.out.println("Корм покупается автоматически при кормлении.");
                    case "4" -> {
                        System.out.print("Тип корма (1-Сено, 2-Зерно): ");
                        int f = Integer.parseInt(sc.nextLine());
                        FeedType feed = f == 1 ? FeedType.HAY : FeedType.GRAIN;
                        farm.feedAll(feed);
                    }
                    case "5" -> farm.collectProducts();
                    case "6" -> farm.sellAll();
                    case "7" -> farm.report();
                    case "0" -> running = false;
                    default -> System.out.println("Неверный ввод!");
                }
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        System.out.println("Завершение");
    }
}
