
public abstract class Item {

    private String flavor;
    private int quantity;
    private double price;

    public Item() {

    }

    public Item(String flavor, int quantity) {
        this.flavor = flavor;
        this.quantity = quantity;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void calculatePrice();

}
