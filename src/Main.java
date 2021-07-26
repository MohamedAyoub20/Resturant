
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Order> AllOrders = new ArrayList();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        while (true) {
            System.out.println("Press 1 to insert a new order\n"
                    + "Press 2 to list all orders in the system.\n"
                    + "Press 3 to cancel a specific order.\n"
                    + "Press 0 to exit the program.\n"
                    + "Please enter your choice:");
            int operation = sc.nextInt();
            if (operation == 1) {
                insertNewOrder();
            } else if (operation == 2) {
                printAllBills();
            } else if (operation == 3) {
                System.out.println("please enter the order id you want to cancel:");
                int id = sc.nextInt();
                printAllBillsAfterRemove(id - 1);
                AllOrders.remove(id - 1);
            } else if (operation == 0) {
                break;
            }
        }

    }

    public static void insertNewOrder() throws IOException {
        Order order = new Order();
        while (true) {
            System.out.println("Please enter 1 for pizza and 2 for ice-cream:");
            int operation = sc.nextInt();
            if (operation == 1) {

                System.out.println("Please enter the pizza flavor:");
                String flavor = new BufferedReader(new InputStreamReader(System.in)).readLine();
                System.out.println("Please enter the quantity:");
                int quantity = sc.nextInt();
                System.out.println("Please enter the toppings corn, olives, and/or onions:");
                String toppings = new BufferedReader(new InputStreamReader(System.in)).readLine();

                Pizza pizza = new Pizza(flavor, quantity);
                pizza.setToppings(toppings);
                pizza.calculatePrice();

                order.orderItems.add(pizza);

            } else if (operation == 2) {
                System.out.println("Please enter the ice-cream flavor:");
                String flavor = new BufferedReader(new InputStreamReader(System.in)).readLine();
                System.out.println("Please enter the quantity:");
                int quantity = sc.nextInt();
                System.out.println("Please enter the number of scoops you want:");
                int numOfScoop = sc.nextInt();

                Ice_cream ice_cream = new Ice_cream(numOfScoop, flavor, quantity);
                ice_cream.calculatePrice();

                order.orderItems.add(ice_cream);
            }

            System.out.println("Please enter 1 for Add Item and 2 for Close Order:");
            int op = sc.nextInt();

            if (op == 2) {

                AllOrders.add(order);

                System.out.println("Your order is:\n|--------------------------------------------------------|");

                for (Item orderItem : order.orderItems) {
                    System.out.println(orderItem.toString());
                    System.out.println("|--------------------------------------------------------|");
                }

                break;
            }
        }
    }

    public static void printAllBills() {
        System.out.println("The orders in the system are:");
        for (int i = 0; i < AllOrders.size(); i++) {

            System.out.println("|--------------------------------------------------------|");
            System.out.println("|ID # " + (i + 1) + "                                              |");

            for (Item item : AllOrders.get(i).orderItems) {
                System.out.println(item.toString());
                System.out.println("|--------------------------------------------------------|");
            }
            AllOrders.get(i).calculateBillAmount();
            System.out.println("|Total Bill      " + AllOrders.get(i).getBillAmount() + "JD     |");
        }

    }

    public static void printAllBillsAfterRemove(int index) {
        System.out.println("The orders in the system are:");
        for (int i = 0; i < AllOrders.size(); i++) {
            if (i != index) {
                System.out.println("|--------------------------------------------------------|");
                System.out.println("|ID # " + (i + 1) + "                                              |");

                for (Item item : AllOrders.get(i).orderItems) {
                    System.out.println(item.toString());
                    System.out.println("|--------------------------------------------------------|");
                }
                AllOrders.get(i).calculateBillAmount();
                System.out.println("|Total Bill      " + AllOrders.get(i).getBillAmount() + "JD     |");
            }
        }

    }

}
