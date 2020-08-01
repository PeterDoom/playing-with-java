package javaCollections.sortedCollections;

public class SortedCollectionsMain {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 1.10, 100);
        stockList.addStock(temp);
    }
}
