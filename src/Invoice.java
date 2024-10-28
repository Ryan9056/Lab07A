import java.util.ArrayList;

public class Invoice {

    String address;
    Double total = 0.0;
    ArrayList<LineItems> lineItems;

    public Invoice(String address, ArrayList<LineItems> lineItems) {
        this.address = address;
        this.lineItems = lineItems;
        for (int i = 0; i < lineItems.size(); i++) {
            total = total + lineItems.get(i).getTotal();
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<LineItems> getLineItems() {
        return lineItems;
    }

    public void setLineItems(ArrayList<LineItems> lineItems) {
        this.lineItems = lineItems;
    }

    public Double getTotal() {
        return total;
    }

}
