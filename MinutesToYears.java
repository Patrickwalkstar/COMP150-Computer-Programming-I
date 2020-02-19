import java.util.Scanner;
public class MinutesToYears{
  public static void main(String [] args) {
    
    //Create Scanner 
    Scanner input = new Scanner(System.in);
    
    //Read in number of minutes
    System.out.print("Enter number of minutes: ");
    int minutes = input.nextInt();
    
    //Compute the number of full days in the minutes
    int fullDays = minutes / (60 * 24);
    
    //Compute years
    int years = fullDays / 365;
    int daysInLastYear = fullDays % 365;
    
    //Print answer
    System.out.println(minutes + " minutes is approx " + years + " years and " + daysInLastYear + "days.");
    
  }
}