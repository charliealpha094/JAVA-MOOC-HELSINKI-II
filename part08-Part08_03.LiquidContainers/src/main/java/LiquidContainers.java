
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Initialize two variables to hold the liquid inside the two containers
        // Also initialize a variable to hold the max value a container can have
        int first = 0;
        int second = 0;
        int maxVolume = 100;


        while (true) {
            // A string to print the initial message with the values inside the containers
            System.out.println("First: " + first + "/" + maxVolume);
            System.out.println("Second: " + second + "/" + maxVolume);
            
            // Assign user input to a variable
            String input = scan.nextLine();
            // Split the string input in parts separated by an empty space
            String[] parts = input.split(" ");
            
            String command = parts[0];
            // Condition to leave the program
            if(command.equals("quit")) {
                break;
            }
            int amount = Integer.valueOf(parts[1]);
            
            // Adding logic (adding liquid to the first container)
            if(command.equals("add") && amount > 0) {
                first += amount;
                if(first >= maxVolume) {
                    first = maxVolume;
                }
            }
            // Part 2: Moving logic ( moving from the first container to the second
            if(command.equals("move") && amount >= 0) {
                if((first - amount) >= 0) {
                    first -= amount;
                    second += amount;
                    if(second >= maxVolume) {
                        second = maxVolume;
                    }
                } else if((first - amount < 0)) {
                    first = 0;
                    second += first;
                    if(second >= maxVolume) {
                        second = maxVolume;
                    }
                }
                
            }
            // Part3: Removing logic (remove from second container)
            if(command.equals("remove") && amount >= 0) {
                if((second - amount) >= 0) {
                    second -= amount;
                } else if((second - amount) < 0) {
                    second = 0;
                }
            }
            
        }
    }

}
