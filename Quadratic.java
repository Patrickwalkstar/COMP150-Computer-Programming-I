import java.util.Scanner;
  public class Quadratic
  {
    public static void main (String [] args)
       {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a, b, and c: ");
      double a = input.nextDouble();
      double b = input.nextDouble();
      double c = input.nextDouble();
      
      double discriminant = b*b - 4 * a * c;
      if(discriminant < 0){
        System.out.println("No real roots");
      }
      else if(discriminant == 0) {
        double r = -b/(2 * a);
        System.out.println("The root is " + r);
      }
      else{
        double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
      System.out.println("The roots are " + r1 + " and " + r2);
      }
    }
 }