import java.util.Scanner;

public class DisplayNumsWithProp{
  public static void main(String[] args) {
    
//Get input
 final int LOW = 100;
 final int HI = 200;
 
 
    int numOnCurrentLine = 0;
 for(int count = LOW; count <= HI; count++) {
   if((count % 5 == 0 && count % 6 != 0) || (count % 6 == 0 && count % 5 != 0)) {
     System.out.print(count + " ");
     numOnCurrentLine++;
     if(numOnCurrentLine == 10){
       System.out.println();
       numOnCurrentLine = 0;
     }
    }
  }
 if (numOnCurrentLine != 0)
   System.out.println();
 }
}