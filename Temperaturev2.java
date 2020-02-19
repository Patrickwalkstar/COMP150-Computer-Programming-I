import java.util.Scanner;

public class Temperaturev2 {
    
    /**
     * @param args the command line arguments
     */
      
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please input a temp in Celsius: ");
    double celsius = input.nextDouble();
    System.out.print("Please input a temp in Fahrenheit: ");
    double fahrenheit = input.nextDouble();
    System.out.print("Pleae input a temp in Kelvin: ");
    double kelvin = input.nextDouble();
    
    System.out.println(celsius + " is " + cToF(celsius) + " fahrenheit.");
    System.out.println(celsius + " is " + cToK(celsius) + " Kelvin.");
    
    System.out.println(fahrenheit + " is " + fToC(fahrenheit) + " celsius.");
    System.out.println(fahrenheit + " is " + fToK(fahrenheit) + " Kelvin.");

    System.out.println(kelvin + " is " + kToC(kelvin) + " celsius.");
    System.out.println(kelvin + " is " + kToF(kelvin) + " fahrenheit.");
  }
  
  public static double cToF(double celsius) {
    return (9.0 / 5) * celsius + 32;
  }
  
  public static double cToK(double celsius) {
    return celsius + 273;
  }
  
  public static double fToC(double fahrenheit) {
    return (5.0 / 9) * (fahrenheit - 32);
  }
  
  public static double fToK(double fahrenheit) {
    return (5.0 / 9) * (fahrenheit - 32) + 273;
  }
  
  public static double kToC(double kelvin) {
    return kelvin - 273;
  }
  
  public static double kToF(double kelvin) {
    return (9.0 / 5) * (kelvin + 273) + 32;
  }
  
}
