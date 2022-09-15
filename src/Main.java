import java.util.Scanner;  // Import the Scanner class
import java.util.logging.Level;
import java.util.logging.Logger;

class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number to check if is multiple of 2");
        boolean bool = false;
        try {
            double number = Double.parseDouble(myObj.nextLine());
            bool = NumberController.isDivisibleBy2(number);
        } catch (Exception e){
            logger.log(Level.WARNING, "error while parsing value. Please insert a number");
        }
        if (bool == true) {
            System.out.println("Multiple of 2");
        }
        else {
            System.out.println("Not multiple of two");
        }
    }
}