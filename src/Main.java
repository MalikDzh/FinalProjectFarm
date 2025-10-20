import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static final Farm farm = new Farm();

    public static void main(String[] args) {
    boolean running = true;
    while (running) {
        showMenu();
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    farm.showFarmStatus();
                    break;
                    case 2:
                        addAnimal();
                        break;
                        case 3:
                            buyFeed();
                            break;
                            case 4:
                                feedAnimal();
                                break;
                                case 5:
                                    farm.collectProducts();
                                    break;
                                    case 6:
                                        sellProducts();
                                        break;
                                        case 7:
                                            showReports();
                                            break;
                                            case 0:
                                                running = false;
                                                break;
                                                default:
                                                    System.out.println("Неверный выбор");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода. Введите число");
        }
    }
    }

    private static void showMenu() {
        System.out.println("1 — Показать ферму");
        System.out.println("2 — Добавить животное");
        System.out.println("3 — Купить корм");
        System.out.println("4 — Кормить животных");
        System.out.println("5 — Собрать продукцию");
        System.out.println("6 — Продать продукцию");
        System.out.println("7 — Отчёты");
        System.out.println("0 — Выход");
    }

    private static void addAnimal() {
        System.out.println("Выберите животное (COW, CHICKEN, SHEEP):");
        String animalType = scanner.nextLine().toUpperCase();
        System.out.println("Введите имя животного:");
        String name = scanner.nextLine();
        System.out.println("Введите возраст животного:");
        int age = Integer.parseInt(scanner.nextLine());

        switch (animalType) {
            case "COW":
                farm.addAnimal(new Cow(name, age));
                break;
            case "CHICKEN":
                farm.addAnimal(new Chicken(name, age));
                break;
            case "SHEEP":
                farm.addAnimal(new Sheep(name, age));
                break;
            default:
                System.out.println("Неверный выбор животного.");
        }

        private static void buyFeed() {
            System.out.println("Выберите корм (HAY, GRAIN):");
            String feedType = scanner.nextLine().toUpperCase();
            System.out.println("Введите количество корма:");
            int quantity = Integer.parse
}