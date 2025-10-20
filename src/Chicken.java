class Chicken extends Animal {
    public Chicken(String name, int age) {
        super(name, age);
    }

    @Override
    public ProductBundle produce() {
        // Логика производства яиц
        if (this.hungerLevel < 5) {
            return new ProductBundle(ProductType.EGG, 0);
        }
        return new ProductBundle(ProductType.EGG, 1); // 1 яйцо
    }
}