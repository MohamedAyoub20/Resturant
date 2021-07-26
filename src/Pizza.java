
public class Pizza extends Item {

    private String toppings;

    private String size;

    public Pizza(String flavor, int quantity) {
        super(flavor, quantity);
    }

    public Pizza(String toppings, String size, String flavor, int quantity) {
        super(flavor, quantity);
        this.toppings = toppings;
        this.size = size;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "|" + "Flavor            " + "Quantity          " + "Toppings         " + "price    |"
                + "\n|" + super.getFlavor() + "         " + super.getQuantity() + "          "
                + getToppings() + "         " + super.getPrice() + "JD    |";
    }

    @Override
    public void calculatePrice() {

        if (super.getFlavor().equals("Four Season")) {
            super.setPrice((2.5 + .5) * super.getQuantity());
        } else if (super.getFlavor().equals("BBQ Chicken")) {
            super.setPrice((1.5 + .5) * super.getQuantity());
        } else if (super.getFlavor().equals("Margherita")) {
            super.setPrice((2+ .5) * super.getQuantity());
        }

    }

}
