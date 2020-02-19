import java.util.Scanner;
public class StringsPractice{
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    String str1 = input.nextLine();
    int count;
    int dCount = 1;
    int d10 = 0;
    for(count = 0; count < str1.length(); count++){
      if(Character.isDigit(str1.charAt(count))){
        d10 += Character.getNumericValue(str1.charAt(count)) * dCount;
        dCount++;
      }
    }
    if(d10 % 11 == 10) {
      System.out.println(str1 + "-" + "X");
    }
    else {
      System.out.println(str1 + "-" + d10 % 11);
    }
    
    String str2 = input.nextLine();
    String firstWord = str2.substring(0,str2.indexOf(";")).trim();
    String secondWord = str2.substring(str2.indexOf(";") + 1,str2.lastIndexOf(";")).trim();
    String thirdWord = str2.substring(str2.lastIndexOf(";") + 1).trim();
    String tempWord;
    
    firstWord = firstWord.substring(0, 1).toUpperCase() + firstWord.substring(1).toLowerCase();
    secondWord = secondWord.substring(0, 1).toUpperCase() + secondWord.substring(1).toLowerCase();
    thirdWord = thirdWord.substring(0, 1).toUpperCase() + thirdWord.substring(1).toLowerCase();
    
    
    while(firstWord.compareTo(secondWord) > 0 || secondWord.compareTo(thirdWord) > 0) {
      if(firstWord.compareTo(secondWord) > 0) {
        tempWord = firstWord;
        firstWord = secondWord;
        secondWord = tempWord;
      }
      if(secondWord.compareTo(thirdWord) > 0) {
        tempWord = secondWord;
        secondWord = thirdWord;
        thirdWord = tempWord;
      }
    }
    
    System.out.println(firstWord);
    System.out.println(secondWord);
    System.out.println(thirdWord);
  }
}