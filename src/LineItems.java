public class LineItems {

    String name;
    int quantity;
    double price;
    double total = 0.0;

    public LineItems(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        total = quantity * price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getTotal() {
        return total;
    }


}
