
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("Please, give a number, type exit to leave");
            
            // First the user input must be a string
            String input = scanner.nextLine();
            
            if(input.equals("end")) {
                break;
            }
            
            // Now convert the string into a number
            int num = Integer.valueOf(input);
            
            // Calculate the result of the cube and print it
            System.out.println(num*num*num);
        }
        
        
       
    }
}
