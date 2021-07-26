
import java.util.ArrayList;

public class Order {

    private int id;
    ArrayList<Item> orderItems;
    private double billAmount;

    public Order() {
        this.id++;
        this.orderItems = new ArrayList();
    }

    public Order(double billAmount) {
        this.id++;
        this.orderItems = new ArrayList();
        this.billAmount = billAmount;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", orderItems=" + orderItems + ", billAmount=" + billAmount + '}';
    }

    public void calculateBillAmount() {
        for (Item orderItem : orderItems) {
            this.billAmount += orderItem.getPrice();
        }
    }

}
