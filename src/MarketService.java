//import java.util.Map;
//class MarketService {
//    private static final Map<ProductType, Integer> productPrices = Map.of(
//            ProductType.MILK, 100,
//            ProductType.EGG, 50,
//            ProductType.WOOL, 200
//    );
//
//    private static final Map<FeedType, Integer> feedPrices = Map.of(
//            FeedType.HAY, 20,
//            FeedType.GRAIN, 30
//    );
//
//    public static int getProductPrice(ProductType productType) {
//        return productPrices.getOrDefault(productType, 0);
//    }
//
//    public static int getFeedPrice(FeedType feedType) {
//        return feedPrices.getOrDefault(feedType, 0);
//    }
//}


import java.util.HashMap;
import java.util.Map;

public class MarketService {
    private Map<ProductType, Integer> productPrices = new HashMap<>();
    private Map<FeedType, Integer> feedPrices = new HashMap<>();
    private Map<AnimalType, Integer> animalPrices = new HashMap<>();

    public MarketService() {
        productPrices.put(ProductType.MILK, 50);
        productPrices.put(ProductType.EGG, 10);
        productPrices.put(ProductType.WOOL, 100);

        feedPrices.put(FeedType.HAY, 30);
        feedPrices.put(FeedType.GRAIN, 20);

        animalPrices.put(AnimalType.COW, 1000);
        animalPrices.put(AnimalType.CHICKEN, 200);
        animalPrices.put(AnimalType.SHEEP, 700);
    }

    public int getProductPrice(ProductType type) {
        return productPrices.getOrDefault(type, 0);
    }

    public int getFeedPrice(FeedType type) {
        return feedPrices.getOrDefault(type, 0);
    }

    public int getAnimalPrice(AnimalType type) {
        return animalPrices.getOrDefault(type, 0);
    }
}
