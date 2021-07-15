public class Fish extends Animal {

    public Fish(){
        super();
    }

    public Fish(String name, String type, String description, double price, boolean isInStock){
        super(name, type, description, price, isInStock);
    }

    @Override
    String getPet() {
        return "Animal Name: " + getName() + "\nAnimal Type: " + getType() + "\nAnimal Description: " + getDescription() + "\n----------------";
    }

}
