import java.util.Scanner;
public class InputValidation{
public static void main(String [] args){
  //Set up Scanner
  Scanner input = new Scanner(System.in);
  
  //Set up parameters
  final int LOW = 0;
  final int HI = 100;
  final int MAX_TRIES = 3;
  
  //Read in the value
  boolean isValid = false;
  int val;
  int numTries = 0;
  while (numTries < MAX_TRIES && !isValid) {
    System.out.print("Enter num: ");
    val = input.nextInt();
    numTries++;
    if(val >= LOW && val <= HI) {
      isValid = true;
    }
  }
  if(isValid){
    System.out.println("OK");
  }
  else{
    System.out.println("Not ok");
}
}
}

//Description: the number of tries to input a number between 0 and 100, 
//fails if the user has failed to input such a number in a certian number of tries