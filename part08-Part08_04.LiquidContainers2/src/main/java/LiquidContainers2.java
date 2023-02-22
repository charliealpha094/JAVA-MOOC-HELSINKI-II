
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        Container container = new Container();
        System.out.println(container);
        
        container.add(50);
        System.out.println(container);
        System.out.println(container.contains());
        
        container.remove(60);
        System.out.println(container);
        
        container.add(200);
        System.out.println(container); */
        
        // 1st: Create two objects for the 1st and 2nd container
        Container container1 = new Container();
        Container container2 = new Container();
        
        // Create the loop
        while(true) {
            System.out.println("First:" + container1);
            System.out.println("Second:" + container2);
            
            String input = scan.nextLine();
            if(input.equals("quit")) {
                break;
            }
            
            // Split the string into several parts
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            // Logic
            if(command.equals("add")) {
                if(container1.contains() >= 100) {
                    container2.add(amount);
                } else {
                    container1.add(amount);
                }
            } else if(command.equals("move")) {
                if(amount < 0 || container1.contains() == 0) {
                    return;
                } else if(amount >= container1.contains()) {
                    container2.add(container1.contains());
                    container1.remove(container1.contains());
                } else {
                    container2.add(amount);
                    container1.remove(amount);
                } 
            } else if(command.equals("remove")) {
                container2.remove(amount);
            }
            
        }
    }

}
