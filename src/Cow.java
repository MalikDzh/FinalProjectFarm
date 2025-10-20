class Cow extends Animal {
    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    public ProductBundle produce() {
        if (this.hungerLevel < 5) {
            return new ProductBundle(ProductType.MILK, 0);
        }
        return new ProductBundle(ProductType.MILK, 1);
    }
}
