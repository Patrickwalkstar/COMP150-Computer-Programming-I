/*
 * File: Rectangles
 * Date: September 29, 2016
 * Authors: Patrick Walker & Jonathon Collom Valdivia
 * Description:
 * 
 * 
 * 
 */
import java.util.Scanner;

public class Rectangles {
  public static void main(String[] args) { 
    // Create a Scanner object that uses standard input. 
    Scanner input = new Scanner(System.in);
    
    // Get coordinates for first rectangle.
    int x1 = input.nextInt(),
      y1 = input.nextInt(),
      x2 = input.nextInt(),
      y2 = input.nextInt();
    
    // Get coordinates for second rectangle.
    int x3 = input.nextInt(),
      y3 = input.nextInt(),
      x4 = input.nextInt(),
      y4 = input.nextInt();
    
    
    // Normalize the coordinates.
    int xLeftRect1 = Math.min(x1,x2),
      xRightRect1 = Math.max(x1,x2),
      yTopRect1 = Math.min(y1,y2),
      yBotRect1 = Math.max(y1,y2),
      xLeftRect2 = Math.min(x3,x4),
      xRightRect2 = Math.max(x3,x4),
      yTopRect2 = Math.min(y3,y4),
      yBotRect2 = Math.max(y3,y4);
      
    // Test for disjoint
    if(xRightRect1 <= xLeftRect2 || xRightRect2 <= xLeftRect1 ||
       yBotRect1 <= yTopRect2 || yBotRect2 <= yTopRect2) {
      System.out.println("disjoint");
    }
    
    // Check if x coordinates of rectangle 1 are within the x coordinates of Rectangle 2.
    else if(xLeftRect2 < xLeftRect1  && xRightRect2 > xRightRect1) {
      // Check if Rectangle 1 is completely contained in Rectangle 2.
      if(yTopRect2 > yTopRect1 && yBotRect2 > yBotRect1) {
        System.out.println("1 is inside 2");
      }
      else if(yTopRect1 < yTopRect2 && yBotRect1 > yBotRect2) {
        int area = (xRightRect1 - xLeftRect1) * (yBotRect2); 
      }
      else if(yBotRect1 > yTopRect2 && yBotRect1 < yBotRect2) {
        
      }
    }
    // Check if x coordinates of rectangle 2 are within the x coordinates of Rectangle 1.
    else if(xLeftRect2 < xLeftRect1 && xRightRect2 > xRightRect1) {
      // Check if rectangle 2 is completely contained in rectangle 1.
      if (yTopRect2 < yTopRect1 && yBotRect2 > yBotRect1) {
        System.out.println("2 is inside 1");
      }
    }
  }
}