/*
 * File: Methods Practice
 * Date: 10/16/2016
 * Authors: Patrick Walker & Jonathon Collom Valdivia
 * Description: This program does multiple things:
 *              a)finds the number of occurences of a specified character in a specified sting
 *              b)takes two specified stings,checking if the characters are in lexicographical 
 *                order and merges them into a single new string that is also lexicographically ordered
 */
import java.util.Scanner;

public class MethodsPractice{
  
  public static void main(String [] args){
    //Get input from user
    Scanner input = new Scanner(System.in);
    String s = input.next();
    char c = input.next().charAt(0);
    System.out.println(characterCount(s, c));
    input.nextLine();
    
    
    //Check if str1 and str2 are in lexicographical order
    String str1;
    String str2;
    do{
    System.out.print("String1: ");
    str1 = input.nextLine().trim();
    } while(!validString(str1));
    do{
    System.out.print("String2: ");
    str2 = input.nextLine().trim();
    } while(!validString(str2));
    
    System.out.println(mergeStrings(str1, str2));
  }
  
  // Returns the number of occurences of character c in the String s
  public static int characterCount(String s, char c){
    int count = 0;
    for(int i = 0; i < s.length(); i++){
      if(c== s.charAt(i)){
        count++;
      }
  }
    return count;
  }
  
  //Returns a merged string of str1 and str2 with characters in lexicographic order
  public static String mergeStrings(String str1, String str2){
    String mergedString = "";
    int i = 0, j = 0;
    while(i < str1.length() || j < str2.length()) {
      if(i >= str1.length()) {
        mergedString = mergedString + str2.charAt(j);
        j++;
      }
      else if(j >= str2.length()) {
        mergedString = mergedString + str1.charAt(i);
        i++;
      }
      else if(str1.charAt(i) <= str2.charAt(j)) {
        mergedString = mergedString + str1.charAt(i);
        i++;
      }
      else {
       mergedString = mergedString + str2.charAt(j);
       j++;
      }
    }
    return mergedString;
  }
  
  //Returns true if the characters are in lexicographic order
  public static boolean validString (String str){
    for(int i = 1; i < str.length() - 1; i++){
      if(!(str.charAt(i) >= str.charAt(i-1) || str.charAt(i) <= str.charAt(i+1))){
        return false;
      }
    }
   return true;   
  }
}
  