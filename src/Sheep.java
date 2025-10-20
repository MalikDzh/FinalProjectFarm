//class Sheep extends Animal {
//    public Sheep(String name, int age) {
//        super(name, age);
//    }
//
//    @Override
//    public ProductBundle produce() {
//        if (this.hungerLevel < 5) {
//            return new ProductBundle(ProductType.WOOL, 0);
//        }
//        return new ProductBundle(ProductType.WOOL, 1);
//    }
//}


public class Sheep extends Animal {

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public AnimalType getType() {
        return AnimalType.SHEEP;
    }

    @Override
    public ProductBundle produce() {
        if (isHungry()) {
            return new ProductBundle();
        }
        return new ProductBundle(ProductType.WOOL, 3);
    }
}
