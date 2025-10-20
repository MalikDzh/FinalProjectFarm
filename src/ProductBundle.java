class ProductBundle {
    private ProductType productType;
    private int quantity;

    public ProductBundle(ProductType productType, int quantity) {
        this.productType = productType;
        this.quantity = quantity;
    }

    public ProductType getProductType() {
        return productType;
    }

    public int getQuantity() {
        return quantity;
    }
}
