////class ProductBundle {
////    private ProductType productType;
////    private int quantity;
////
////    public ProductBundle(ProductType productType, int quantity) {
////        this.productType = productType;
////        this.quantity = quantity;
////    }
////
////    public ProductType getProductType() {
////        return productType;
////    }
////
////    public int getQuantity() {
////        return quantity;
////    }
////}
//import java.util.HashMap;
//import java.util.Map;
//
//public class ProductBundle {
//    private Map<ProductType, Integer> products = new HashMap<>();
//
//    public ProductBundle() {
//        // пустой конструктор
//    }
//
//    public ProductBundle(ProductType type, int count) {
//        products.put(type, count);
//    }
//
//    public Map<ProductType, Integer> getProducts() {
//        return products;
//    }
//
//    @Override
//    public String toString() {
//        return products.toString();
//    }
//}
//


import java.util.HashMap;
import java.util.Map;

public class ProductBundle {
    private Map<ProductType, Integer> products = new HashMap<>();

    public ProductBundle() {}

    public ProductBundle(ProductType type, int count) {
        products.put(type, count);
    }

    public Map<ProductType, Integer> getProducts() {
        return products;
    }

    public void add(ProductType type, int count) {
        products.put(type, products.getOrDefault(type, 0) + count);
    }

    @Override
    public String toString() {
        return products.toString();
    }
}
