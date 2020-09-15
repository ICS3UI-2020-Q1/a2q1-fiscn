import java.util.Scanner; 

/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a Scanner for user input 
     Scanner input = new Scanner(System.in); 

     // ask the user to input a integer to check if it's even or odd 
     System.out.println("Please enter an integer:"); 

     // create a variable for integer 
     int integer = input.nextInt(); 

     // create variable for remainder 
     int remainder = integer % 2;
      
     if (remainder == 0) {
       System.out.println (integer + " is an even number");
     }else {
       System.out.println(integer + " is an odd number");
     }

     

    
  }
}
