/* 
 * File: Loops
 * Date: October 13, 2016
 * Authors: Patrick Walker & Jonathon Collom Valdivia
 * Description: This program does two things. First it reads in an integer from the user and prints out all perfect numbers between zero and that input.
 *              Second, it reads in two strings delimited by spaces and prints if the first is "lesser," "greater," or "equals" the second string.
 */

import java.util.Scanner;

public class LoopsPractice {
  public static void main(String [] args) {
    //Get input from user
    Scanner input = new Scanner(System.in);
    int posNum = input.nextInt();
    
    //Determine if numbers between 1 and posNum are perfect and if so, prints.
    for(int i = 1; i < posNum; i++) {
      if(isPerfect(i)) {
        System.out.println(i);
      }
    }
    
    
    //Get user inputs and initialize loop control
    String str1 = input.next();
    String str2 = input.next();
    int a = 0;
   
    // Determines and prints if str1 is lexicographicaly less than, greater than, or equal to str2.
    while(a < Math.min(str1.length(),str2.length())){
      if(str1.charAt(a) < str2.charAt(a)) {
        System.out.println("less");
        break;
      }
      else if (str1.charAt(a) > str2.charAt(a)) {
        System.out.println("greater");
        break;
      }
      else {
        if(str1.length() < str2.length()) {
          System.out.println("less");
          break;
        }
        else if(str1.length() > str2.length()) {
          System.out.println("greater");
          break;
        }
        else {
          System.out.println("equal");
          break;
        }
      }   
    }
  }
  
  //Determines tha max divisor of posNum
  public static int findMaxDivisor(int posNum) {
    for(int i = 2; i < posNum; i++) {
      if (posNum % i == 0) {
        return posNum / i;
      }
    }
    return -1;
  }
  
  //Finds the sum of all numbers that can divide into posNum evenly.
  public static int divisorSum(int posNum) {
    int divisorSum = 0;
    for(int j = 1; j <= findMaxDivisor(posNum); j++) {
      if(posNum % j == 0) {
        divisorSum += j;
      }
    }
    return divisorSum;
  }
  
  //Checks to see if the parameter is perfect.
  public static boolean isPerfect(int posNum) {
    if(divisorSum(posNum) == posNum) {
      return true;
    }
    else {
      return false;
    }
  }
}
  