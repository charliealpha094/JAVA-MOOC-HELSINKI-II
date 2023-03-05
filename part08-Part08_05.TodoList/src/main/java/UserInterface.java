
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    // Instance variables
    private Scanner scanner;
    private TodoList todolist;
    
    // Constructor
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todolist = todoList;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            if(command.equals("stop")) {
                break;
            } else if(command.equals("add")) {
                System.out.println("To add: ");
                String addTask = scanner.nextLine();
                todolist.add(addTask);
            } else if(command.equals("list")) {
                todolist.print();
            } else if(command.equals("remove")) {
                System.out.println("Which one is removed?");
                int indexToRemove = Integer.valueOf(this.scanner.nextLine());
                this.todolist.remove(indexToRemove);
            }
        }
    }
    
}
