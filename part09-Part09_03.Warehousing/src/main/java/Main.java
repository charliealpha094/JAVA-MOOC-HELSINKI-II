

public class Main {

    public static void main(String[] args) {
        
        // Part 1, 2
        /*
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName());
        juice.addToWarehouse(1.0);
        System.out.println(juice); */
        
        // Part 5
        /*
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName());
        juice.addToWarehouse(1.0);
        System.out.println(juice);
        
        System.out.println(juice.history()); */
        
        // Part 6
        /*
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName());
        juice.addToWarehouse(1.0);
        System.out.println(juice);
        
        System.out.println(juice.history()); */
        
        // Part 7
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);
        
        juice.printAnalysis();
    }

}
