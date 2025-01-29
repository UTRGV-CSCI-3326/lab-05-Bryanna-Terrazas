import java.util.Scanner;

public class Input{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Medical Form
        //Ask the user for their name and store it as a string
        String name;
        System.out.print("Name: ");
        name = scanner.nextLine();

        //Ask the user for their age and store it as an integer
        int age;
        System.out.print("Age: ");
        age = scanner.nextInt();

        //Ask the user for their weight and store it as a double
        double weight;
        System.out.print("Weight: ");
        weight = scanner.nextDouble();

        //Ask the user whether they smoke and store as a boolean
        boolean isSmoker;
        System.out.print("Are you a smoker?(true/false): ");
        isSmoker = scanner.nextBoolean();

        //Output all information back to the user
        System.out.println("Your name is: " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your current weight is: " + weight + " lbs");

        //Just making sure the user puts either or
        if(isSmoker == true){
            System.out.println("You are a smoker.");
        }
        else if(isSmoker == false){
            System.out.println("You are not a smoker.");
        }
        else{
            System.out.println("You did not put a valid answer for whether or not you smoke.");
        }
    }

}