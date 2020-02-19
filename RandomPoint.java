/*
 * Enter x and y coord of upper left corner: 10, 30
 * Enter x and y coord of lower right corner: 60, 100
 * A random pont in the rectangle is (48.7, 79.2).
 */

import java.util.Scanner;

public class RandomPoint
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    
   
    System.out.print("Enter x an y coord of upper left corner: ");
    double upperLeftX = input.nextDouble();
    double upperLeftY = input.nextDouble();
    System.out.print("Enter x and y coord of lower right corner: ");
    double lowerRightX = input.nextDouble();
    double lowerRightY = input.nextDouble();
    
    if(upperLeftX >= lowerRightX || upperLeftY >= lowerRightY){
      System.out.println("Bad input");
    }
    else {
      double randX = upperLeftX + Math.random() * (lowerRightX - upperLeftX);
      double randY = upperLeftY + Math.random() * (lowerRightY - upperLeftY);
      System.out.println("Random p0int is (" + randX + ", " + randY + ")");
  }
}
}

