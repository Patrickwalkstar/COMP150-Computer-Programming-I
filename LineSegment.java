import java.util.Scanner;

public class LineSegment
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter endpoints of segment 1: ");
    int left1 = input.nextInt();
    int right1 = input.nextInt();
    
    System.out.print("Enter endpoints of segment 2: ");
    int left2 = input.nextInt();
    int right2 = input.nextInt();
    
    if(left1 >= left2 && right1 <= right2) {
      System.out.println("1 in 2");
    }  
    else if(right1 < left2 || right2 <left1){
      System.out.println("Disjoint");
    }
    else if(left2 >= left1 && right2 <= right1){
      System.out.println("2 inside 1");
    }
    else{
      System.out.println("Overlap");
    }
  }
}