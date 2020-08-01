package javaCollections.sortedCollections;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityStock = 0;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        }
    }

    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityStock + quantity;
        if (newQuantity >=0){
            this.quantityStock = newQuantity;
        }
    }

    @Override
    public boolean equals(Object object){
        System.out.println("Entering StockItem.equals");
        if(object == this){
            return true;
        }
        if ((object == null) || (object.getClass() != this.getClass())){
            return false;
        }
        String objName = ((StockItem) object).getName();
        return this.name.equals(objName);
    }

}
