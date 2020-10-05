public class Shirt {
    public int shirtID = 15;
    public String description = "Good !";
    public String R = "Red";
    public String B = "Blue";
    public String G = "Green";
    public String U = "Unsent";
    public String colorCode = new String(R);
    public double price = 698.1;
    public int quantityInStock = 500;

    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }
}
