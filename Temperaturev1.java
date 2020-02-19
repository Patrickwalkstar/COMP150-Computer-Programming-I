/*
 * File: Temp Convert
 * Date: 9/8/16
 * Author: Patrick Walker
 * Description: Program to convert C to F
 */

import java.util.Scanner;

public class Temperaturev1{
  public static void main(String [] args){
    
    //Declare and initialize a Scanner object to 
    //get user input
    Scanner input = new Scanner(System.in);
    //Declare a variable to store Degrees C and read in
    //from user the degrees C.
    double degreesC;
    System.out.print("Enter a degree in Celsius: ");
    degreesC = input.nextDouble();
    
    //Convert deg C to F
    double degreesF = ((9.0/5.0) * degreesC + 32.0);
    
    System.out.println(degreesC + " Celsuis is " + degreesF + " Farenheit");
     
  }
}
  