import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String address;
        String name;
        int quantity;
        double price;
        ArrayList<LineItems> lineItems = new ArrayList<>();
        boolean loop = true;


        address = JOptionPane.showInputDialog(null, "Enter Customer Address");


        while (loop) {
            name = JOptionPane.showInputDialog(null, "Enter Product Name");
            quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Quantity"));
            price = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Price"));
            lineItems.add(new LineItems(name, quantity, price));
            int choice = JOptionPane.showConfirmDialog(null, "Any more Items",null,JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.NO_OPTION) {
                loop = false;
            }
        }

        Invoice invoice = new Invoice(address, lineItems);


        System.out.println("Invoice");
        System.out.println(invoice.getAddress());

        for (int i = 0; i < invoice.getLineItems().size(); i++) {
            System.out.print("\n" + invoice.getLineItems().get(i).getName());
            System.out.print("                  " + invoice.getLineItems().get(i).getQuantity());
            System.out.print("  " + invoice.getLineItems().get(i).getPrice());
            System.out.print("  " + invoice.getLineItems().get(i).getTotal());
        }

        System.out.println("\nAmount due: " + String.format("%.2f", invoice.getTotal()));


    }
}