import java.util.Scanner;

public class StringToInt{
  public static void main(String [] args) {
   //Get input
     Scanner input = new Scanner(System.in);
     String numStr;
     
     
     //Read in an integer as a string
     while(true){
       System.out.print("Enter an integer: ");
       numStr = input.next();
       
       if(validInteger(numStr) == true){
       break;
     }
      else{
       System.out.println("Bad input. Try again.");
     }
  }
  System.out.println("Your number is " + strToInt(numStr));
  input.close();
  }
  public static int strToInt(String str){
 int factor = -1;
  if(str.charAt(0) == '-'){
    
    str = str.substring(1);
  }
  else if (str.charAt(0) == '+') {
    str = str.substring(1);
  }
  int val = 0;
  for (int i = 0; i < str.length(); i++){
    val = 10 * val + Character.getNumericValue(str.charAt(i));
  }
 val *= factor;
 return val;
  }
  
  public static boolean validInteger(String str){
    //Skip past the leading sign if there is one.
    if(str.length() > 0 && (str.charAt(0) == '+' || str.charAt(0) == '-')){
      str = str.substring(1);
  }
    
    //Check for empty string
    if(str.length() == 0)
      return false;
    
    //Check ramianing characters - they should be digits
    int i;
    for(i = 0; i < str.length(); i++) {
      if(!Character.isDigit(str.charAt(i)))
        return false;
      /*  OR
       * if(str.charAt(i) < '0' || str.charAt(i) > '9')
       * return false;
       */
    }
    return true;
  }
}
    