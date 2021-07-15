import java.util.ArrayList;
import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Animal> animalArrayList = new ArrayList<>();
        int count = 0;

        do {
            count++;
            // creating fish object
            Fish fish = new Fish();
            System.out.print("Enter your Fish name: ");
            fish.setName(input.nextLine());
            System.out.print("Enter your Fish type: ");
            fish.setType(input.nextLine());
            System.out.print("Enter your Fish description: ");
            fish.setDescription(input.nextLine());
            System.out.println();

            //adding a fish object to the animalArrayList
            animalArrayList.add(fish);

            // creating turtle object
            Turtle turtle = new Turtle();
            System.out.print("Enter your Turtle name: ");
            turtle.setName(input.nextLine());
            System.out.print("Enter your Turtle type: ");
            turtle.setType(input.nextLine());
            System.out.print("Enter your Turtle description: ");
            turtle.setDescription(input.nextLine());
            System.out.println();

            //adding a turtle object to the animalArrayList
            animalArrayList.add(turtle);
        } while (count < 2);


        //displaying animalArrayList
        for ( Animal animal : animalArrayList)
            System.out.println(animal.getPet());





    }
}
