import java.util.Scanner;
public class DisplayPattern{
  public static void main(String[] args) {
    //Get size of pattern from user.
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    
    // Display pattern
    for(int i = 1; i <= n; i++){
      //Display spaces
      for (int k = 1; k <= n - i; k++) {
        System.out.print("  ");
      }
      //Display row of numbers
      for(int j = i; j >= 1; j--){
        System.out.print(j + " ");
      }
      // Display the new line
      System.out.println();
    }   
  }
}