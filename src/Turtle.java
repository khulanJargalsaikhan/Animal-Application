public class Turtle extends Animal{

    public Turtle(){
        super();
    }
    public Turtle(String name, String type, String description, double price, boolean isInStock){
        super(name, type, description, price, isInStock);
    }

    @Override
    String getPet() {
        return "Animal Name: " + getName() + "\nType: " + getType() + "\nDescription: " + getDescription() + "\n----------------";
    }
}
