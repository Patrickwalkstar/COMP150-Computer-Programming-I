import java.util.Scanner;

public class WindChill {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter temp and wind speed: ");
    double temp = input.nextDouble();
    double windSpeed = input.nextDouble();
    
    //Compute wind chill
    double windChill = 35.74 + .6215 * temp - 35.75 * Math.pow(windSpeed, 0.16) + 0.4295 * temp * Math.pow(windSpeed, 0.16);
    
    //Display Answer
    System.out.println("The wind chill is " + windChill);
  }
}