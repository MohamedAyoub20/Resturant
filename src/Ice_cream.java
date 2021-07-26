
public class Ice_cream extends Item {

    private int numOfScoop;

    public Ice_cream(String flavor, int quantity) {
        super(flavor, quantity);
    }

    public Ice_cream(int numOfScoop, String flavor, int quantity) {
        super(flavor, quantity);
        this.numOfScoop = numOfScoop;
    }

    public int getNumOfScoop() {
        return numOfScoop;
    }

    public void setNumOfScoop(int numOfScoop) {
        this.numOfScoop = numOfScoop;
    }

    @Override
    public void calculatePrice() {

        if (super.getFlavor().equals("Strawberry")) {
            super.setPrice(((1.5 * super.getQuantity()) + (.5 * getNumOfScoop())));
        } else if (super.getFlavor().equals("Pistachio")) {
            super.setPrice((2 * super.getQuantity()) + (.5 * getNumOfScoop()));
        } else if (super.getFlavor().equals("Vanilla")) {
            super.setPrice((.75 * super.getQuantity()) + (.5 * getNumOfScoop()));
        }

    }

    @Override
    public String toString() {
        return "|" + "Flavor       " + "Quantity        " + "# of scoops       " + "price          |"
                + "\n|" + super.getFlavor() + "       " + super.getQuantity() + "                      "
                + getNumOfScoop() + "                   " + super.getPrice() + "JD        |";
    }

}
