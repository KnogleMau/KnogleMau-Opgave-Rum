//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
ArrayList<Customer> customers = new ArrayList<>();
customers.add(new Customer("Magnus","Simonsen", "Knoglemav"));
customers.add(new Customer("Patrick","Poulsen", "Patski"));
customers.add(new Customer("Tobias","Høj", "Hoej"));
customers.add(new Customer("Sander","Noel", "Noel"));
customers.add(new Customer("Kalle","Guldager", "Guldager"));



        printCustomers(customers);
    }
    public static void printCustomers(ArrayList<Customer> customers){
        for (Customer customer : customers){
            System.out.println(customer);
        }
    }
}