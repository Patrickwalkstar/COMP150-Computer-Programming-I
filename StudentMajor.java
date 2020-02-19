// M3 Math Junior
/*M - MAth
 * C - Computer Science
 * I - Informaiton Science
 * 1 - Freshman
 * 2 - Sophomore
 * 3 - Junior
 * 4 - Senior
 */

import java.util.Scanner;
public class StudentMajor {
  public static void main (String [] args) {
    //Get user input
    Scanner input = new Scanner(System.in);
    System.out.print("Enter major and status: ");
    String str = input.nextLine();
    str = str.trim();
    
    //Check input length
    if(str.lenght() != 2) {
      System.out.println("Bad input");
      
    }
    else {
      char major = str.charAt(0);
      major = Character.toUpperCase(major);
      char status  = str.charAt(1);
      
      //Handle major
      if(major != 'M' && major != 'C' && major != 'I') {
        System.out.println("Bad input");
      }
      else { 
        if(major == 'M') {
          System.out.println("Math ");
                }
      else if { 
        if(major == 'C') {
          System.out.println("Computer Science ");
                }
      else { 
        if(major == 'I') {
          System.out.println("Info Science ");
        }
        //Handle Status
        if(status < '1' || status > '4') {
          System.out.println("Bad input");
        }
        else {
          if(status == '1') {
            
      }
      }
      }
    }
  }
}