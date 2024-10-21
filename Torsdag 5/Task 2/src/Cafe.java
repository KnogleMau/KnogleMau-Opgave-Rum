import java.util.ArrayList;
import java.io.File ;
import java.io.FileNotFoundException;
import java.util.Scanner ;



public class cafe {
    Private ArrayList<String> CoffeeMenu = new ArrayList<>();


   public ArrayList<String> loadMenuData(){
       File file = new File("coffees.txt");

       try {
           File file = new File("coffees.txt");
           Scanner scan = new Scanner(file);

           while(scan.hasNextLine()){
               CoffeeMenu.add(scan.nextLine());
           }
       }
       catch(FileNotFoundException e) {
           System.out.println("File not found. Check path and filename");
        }
       }
   }
}
