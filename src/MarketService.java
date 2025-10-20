import java.util.Map;
class MarketService {
    private static final Map<ProductType, Integer> productPrices = Map.of(
            ProductType.MILK, 100,
            ProductType.EGG, 50,
            ProductType.WOOL, 200
    );

    private static final Map<FeedType, Integer> feedPrices = Map.of(
            FeedType.HAY, 20,
            FeedType.GRAIN, 30
    );

    public static int getProductPrice(ProductType productType) {
        return productPrices.getOrDefault(productType, 0);
    }

    public static int getFeedPrice(FeedType feedType) {
        return feedPrices.getOrDefault(feedType, 0)
    }
}
