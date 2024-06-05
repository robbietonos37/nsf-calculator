import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("At the current moment, this software package only calculates the volume of a sphere,\n" +
                " please enter the radius of the sphere (in meters) and this software will return the volume, or enter -1 to exit");
        String input = scanner.nextLine();
        double userNumber = 0;

        try {
            userNumber = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number next time.");
            System.exit(1);
        }

        if(userNumber == -1){
            System.exit(0);
        }

        System.out.println("User number is: " + userNumber);
        Sphere sphere = new Sphere(userNumber);
        double volume = sphere.calculateVolume();
        System.out.println("The volume of your sphere is " + volume + " meters cubed");

    }
}
