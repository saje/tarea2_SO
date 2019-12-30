import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    System.out.println("Hello world");
    try {
     File myObj = new File("funciones.txt");
     Scanner myReader = new Scanner(myObj);
     while (myReader.hasNextLine()) {
       String data = myReader.nextLine();
       if (data.length()!=2) {
         System.out.println(data.substring(0,4));

       }
     }
     myReader.close();
   } catch (FileNotFoundException e) {
     System.out.println("An error occurred.");
     e.printStackTrace();
   }
  }
}
