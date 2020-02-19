import java.util.Scanner;
public class SmallestN {
public static void main(String [] args){
  //Get Scanner Object
  Scanner input = new Scanner(System.in);
  
  //Read in positive number.
  int num;
  while (true) {
    System.out.print("Enter num: ");
    num = input.nextInt();
    if(num > 0) {
      break;
    }
    else {
      System.out.println("Error. Try again.");
    }
  }
  int n = 1;
  while (n * n <= num){
    n++;
    
    }
   }
  }