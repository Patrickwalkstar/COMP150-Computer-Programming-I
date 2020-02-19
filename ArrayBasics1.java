

import java.util.Scanner;

/* File: ArrayBasics.java
 * Author: COMP 150 class
 * Date: October 25, 2016
 * Description: Includes code that illustrates use of arrays.
 */

import java.util.Scanner;

public class ArrayBasics1 {
  public static void main(String [] args) {
    // Get number of scores
     Scanner input = new Scanner(System.in);
     System.out.print("Enter number of scores: ");
     int numScores = input.nextInt();
     
     // Declare the array and create it.
     double [] testScores;  
     testScores = new double[numScores];  
     
     // Read in test scores
     for (int i = 0; i < numScores; i++) {
       System.out.print("Enter score " + i + ":");
       testScores[i] = input.nextDouble(); 
     }
     
     // Compute average of test scores
     double testScoreAvg = arrayAvg(testScores);
     
     // Shift the scores one element to right (with wraparound)
     // in the array.
     System.out.println("Scores before = " + toString(testScores));  
     shiftRight(testScores);
     System.out.println("Scores after = " + toString(testScores));
     
     // Make a copy of the array.
     double [] testScoresCopy = arrayCopy(testScores);
     
     // Create and initialize an array with an initialization list.
     int [] ar = {1, 2, 3, 4, 5};
     
     // Declare, create, and initialize an array of Strings.
     String [] sar = new String[4];
     sar[0] = "Now";
     sar[1] = "is";
     sar[2] = "the";
     sar[3] = "time";
     
     // Count the number of instances of a specified character in the array
     // of strings.
     System.out.println("The number of t's in the array is " +
                        charCount(sar, 't'));
     
     // Reverse an array of integers in place.
     System.out.println("Array before reverse = " + toString(ar));
     reverse(ar);
     System.out.println("Array after reverse = " + toString(ar));
     
    int [] nums = {92, 45, 12, 56, 489, 3459, 27, 39, 29};
   
     System.out.println("array before sort = " + toString(nums));
     selectionSort(nums);
     System.out.println("array after sort = " + toString(nums));
  }
  public static void selectionSort(int [] ar){
    for (int i = 0; i < ar.length - 1; i++) {
      // Find the smallest value in the array ar, starting at index i, and
      //swap it into index i
      int indexSmallest = i;
      for (int j = i + 1; j < ar.length; j++) {
        if (ar[j] < ar[indexSmallest]) {
          indexSmallest = j;
        }
    }
        int temp = ar[i];
        ar[i] = ar[indexSmallest];
        ar[indexSmallest] = temp;
      }
    
     // Declare an array of integers that are sorted.
     int [] ar2 = {3, 10, 18,21, 35, 46, 48, 51, 67};
     
     // Search for specified values within the array.
     System.out.print("Enter a number: ");
     int num = input.nextInt();
     
     while (num != 0) {
       // Search for num withing the array ar2 using linear search.
       int index = linearSearch(ar2, num);
       if (index == -1) {
         System.out.println("The number " + num + " was not in the array");
       }
       else {
         System.out.println("The index of " + num + " in the array is " +
                            index);
       }
       
       // Search for the same value using binary search.
       index = binarySearch(ar2, num);
       if (index == -1) {
         System.out.println("The number " + num + " was not in the array");
       }
       else {
         System.out.println("The index of " + num + " in the array is " +
                            index);
       }
       
       // Get another number to search for.
       System.out.print("Enter a number: ");
       num = input.nextInt();
     }
    }
  
  
  /*
   * Returns the index of an instance of n in the array ar.
   * Returns -1 if n is not in ar.  ar must be sorted from
   * smallest to largest.
   */
  public static int binarySearch(int [] ar, int n) {
    int left = 0; 
    int right = ar.length - 1;
    
    while (left <= right) {
      int middle = (left + right) / 2;
      if (ar[middle] == n) 
        return middle;
      else if (n < ar[middle]) 
        right = middle - 1;
      else
        left = middle + 1;
    }
    
    return -1;
  }
  
  /* Returns the index of an instance of n in the array ar.
   * Returns -1 if n is not in ar.
   */
  public static int linearSearch(int [] ar, int n)  {
    for (int i = 0; i <ar.length; i++) {
      if (ar[i] == n)
        return i;
    }
    
    return -1;
    
  }
  
  /* Reverses the elements of the array ar in place.
   */
  public static void reverse(int [] ar) {
    int i = 0;
    int j = ar.length - 1;
    int temp;
    while (i < j) {
      temp = ar[j];
      ar[j] = ar[i];
      ar[i] = temp;
      i++;
      j--;
    }
    
  }
  
  /* Returns the number of instances of the character ch in the String
   * array strAr.
   */
  public static int charCount(String [] strAr, char ch)   {
    int count = 0;
    for (int i = 0; i < strAr.length; i++) {
      for (int k = 0; k < strAr[i].length(); k++) {
        if (ch == strAr[i].charAt(k)) {
          count++;
        }
      }
    }
    return count;
  }
  
  /* Shifts elements of the array ar one element to the right, with
   * wraparound
   */
  public static void  shiftRight(double [] ar) {
    // Save the last element
    double temp = ar[ar.length - 1];
    
    // Shift one element to the right, starting 
    // from the second last element.
    for (int i = ar.length - 2;  i >= 0;i--) {
      ar[i+1] = ar[i];
    }
    
    // Copy last element into first
    ar[0]= temp;
  }
  
  /* Create a string representation of the array ar. 
   */
  public static String toString(double [] ar) {
    String str = "[";
    for (int i = 0; i < ar.length; i++) {
      str = str + ar[i] + " ";
    }
    str = str.trim() + "]";
    return str;
  }
  
   /* Create a string representation of the array ar. 
   */
  public static String toString(int [] ar) {
    String str = "[";
    for (int i = 0; i < ar.length; i++) {
      str = str + ar[i] + " ";
    }
    str = str.trim() + "]";
    return str;
  }
  
  /* Create and return a copy of the array ar
   */
  public static double [] arrayCopy(double [] ar) {
    double [] arCopy = new double[ar.length];
    for (int i = 0; i < ar.length; i++) {
      arCopy[i] = ar[i];
    }
    return arCopy;
  }
  
  /* Compute and return the average of the elements of
   * the array ar.
   */
  public static double arrayAvg(double [] ar) {
    double sum = 0.0;
    for (int i = 0;  i < ar.length  ;  i++){
      sum += ar[i];
    }
    
    return sum / ar.length;
  }
}
}
