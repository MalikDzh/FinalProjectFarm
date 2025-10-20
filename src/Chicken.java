////class Chicken extends Animal {
////    public Chicken(String name, int age) {
////        super(name, age);
////    }
////
////    @Override
////    public ProductBundle produce() {
////        // Логика производства яиц
////        if (this.hungerLevel < 5) {
////            return new ProductBundle(ProductType.EGG, 0);
////        }
////        return new ProductBundle(ProductType.EGG, 1); // 1 яйцо
////    }
////}
//
//public class Chicken extends Animal {
//
//    public Chicken(String name, int age) {
//        super(name, age);
//    }
//
//    @Override
//    public AnimalType getType() {
//        return AnimalType.CHICKEN;  // 👈 обязательно реализуем этот метод
//    }
//
//    @Override
//    public ProductBundle produce() {
//        if (isHungry()) {
//            return new ProductBundle(); // если голодна, ничего не производит
//        }
//        return new ProductBundle(ProductType.EGG, 5);
//    }
//}


public class Chicken extends Animal {

    public Chicken(String name, int age) {
        super(name, age);
    }

    @Override
    public AnimalType getType() {
        return AnimalType.CHICKEN;
    }

    @Override
    public ProductBundle produce() {
        if (isHungry()) {
            return new ProductBundle();
        }
        return new ProductBundle(ProductType.EGG, 8);
    }
}
