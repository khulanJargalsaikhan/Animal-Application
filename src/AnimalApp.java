import java.util.ArrayList;
import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList> animalArrayList = new ArrayList<>();
        ArrayList<Fish> fishArrayList = new ArrayList<>();
        ArrayList<Turtle> turtleArrayList = new ArrayList<>();
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

            //adding a fish object to the fishArrayList
            fishArrayList.add(fish);

            // creating turtle object
            Turtle turtle = new Turtle();
            System.out.print("Enter your Turtle name: ");
            turtle.setName(input.nextLine());
            System.out.print("Enter your Turtle type: ");
            turtle.setType(input.nextLine());
            System.out.print("Enter your Turtle description: ");
            turtle.setDescription(input.nextLine());
            System.out.println();

            //adding a turtle object to the turtleArrayList
            turtleArrayList.add(turtle);
        } while (count < 2);

        animalArrayList.add(fishArrayList);
        animalArrayList.add(turtleArrayList);

        //displaying fishArrayList
        for ( Fish fish : fishArrayList)
            System.out.println(fish.getPet());

        //displaying turtleArrayList
        for ( Turtle turtle : turtleArrayList)
            System.out.println(turtle.getPet());

        //displaying animalArrayList
        for (int i=0; i< animalArrayList.size(); i++)
            System.out.println(animalArrayList.get(i));




    }
}
