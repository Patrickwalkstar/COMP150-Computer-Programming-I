//Format either:jOHn Doe or DoE, jOhn -> Hello, John Doe
import java.util.Scanner;

public class NameConvert
{
  public static void main(String [] args)
  {
    //Get input
    Scanner input = new Scanner(System.in);
    String name = input.nextLine().trim();
    String firstName, lastName;
    
    //Check for comma
    int indexComma = name.indexOf(',');
    if(indexComma >= 0) { 
      lastName = name.substring(0, indexComma).trim();
      firstName = name.substring(indexComma + 1).trim();
    }
    else{
      //First Name followed by last name (no comma)
      int indexSpace = name.indexOf(' ');
      firstName = name.substring(0, indexSpace);
      lastName = name.substring(indexSpace + 1).trim();
    }
    firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
    lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
   
    System.out.println("Hello, " + firstName + " " + lastName);
  }
}