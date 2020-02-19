import java.util.Scanner;

public class CharacterCount {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    String s2 = input.nextLine();
    
    int numUpperCase = characterCount(s);
    System.out.println("Num upper case = " + numUpperCase);
    
    int num2 = characterCount(s2);
    System.out.println("Num 2 upper case = " + num2);
    
    int total = 0;
    while(true){
      System.out.print("Enter string:");
      String s3 = input.nextLine();
      if (s3.length() == 0)
        break;
      total += characterCount(s3);
    }
    System.out.println("Total uc letters = " + total);
  }
  public static int characterCount(String str){
   int count = 0;
   for (int i = 0; i < str.length(); i++){
     if(Character.isUpperCase(str.charAt(i))){
       count++;
     }  
   }
   return count;
  }
}
                                          
                                        