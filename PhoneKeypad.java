import java.util.Scanner;

public class PhoneKeypad{
  public static void main(String [] args) {
    //Read input from user
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a phone number: ");
    String number = input.next();
    String numberNoLetters;
    numberNoLetters = letterToNumber(number);
    
    //Display Number
    System.out.println(numberNoLetters);
  }
  
  //Converts Keypad Number
  public static String letterToNumber(String num)
  {
    String newNum = "";
   for (int i = 0; i < num.length(); i++){
    char c = num.charAt(i);
    if(Character.isLetter(c)) {
      c = Character.toLowerCase(c);
      if(c == 'a' || c == 'b' || c == 'c'){
        newNum = newNum + '2';
      }
      else if(c == 'd' || c == 'e' || c == 'f'){
      newNum = newNum + '3';
    }
    else if(c == 'g' || c == 'h' || c == 'i'){
      newNum = newNum + '4';
  }
   else if(c == 'j' || c == 'k' || c == 'l'){
      newNum = newNum + '5';
   }
  else if(c == 'm' || c == 'n' || c == 'o'){
      newNum = newNum + '6';
   }
else if(c == 'p' || c == 'q' || c == 'r' || c == 's'){
      newNum = newNum + '7';
   }
   else if(c == 't' || c == 'u' || c == 'v')
      newNum = newNum + '8';
  }
    else{
      newNum = newNum + '9';
      newNum = newNum + c;
    }
  }
  return newNum;
   }
  }
    