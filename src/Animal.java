public abstract class Animal {
    //private member variables
    private String name;
    private String type;
    private String description;
    private double price;
    private boolean isInStock;

    //default constructor
    public Animal(){

    }

    //overloaded constructor
    public Animal(String name, String type, String description, double price, boolean isInStock){
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    abstract String getPet();

}
