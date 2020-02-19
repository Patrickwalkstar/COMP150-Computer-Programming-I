import java.util.Scanner;

public class Arrays{
  public static void main(String [] args){
    
    //Read input from the user
   Scanner input = new Scanner(System.in);
   //Reads input from the user for the length of the array
   int [] ar = new int [input.nextInt()]; 
   //Read in the elements of the array
   for (int i = 0; i < ar.length; i++) {
   ar[i] = input.nextInt(); 
   }
   //Read in the parameter n tha specifies the scale factor
   //to send to the copyIntArray method.
   int n = input.nextInt();
     
   int [] ar2 = {1,2,3};
     
   //Use the copyIntArray method to create a new array that 
   //is n times as long as the user's array.
   int [] copy1 = copyIntArray(ar, n);
 
   //Display the new array
   displayIntArray(copy1);
    
   //Get a new value for n that represents num students/lockers
   n = input.nextInt();
    
   //Create boolean array represents state of lockes with all lockers closed (false)
   boolean [] lockers = new boolean [n];
   for(int i = 0; i < lockers.length; i++) {
     lockers[i] = false;
   }
      
   //Changes every ith lockers state to its opposite for every student.
   for(int i = 0; i < lockers.length; i++) {
     for(int j = i; j < lockers.length; j = j + i + 1) {
       lockers[j] = !lockers[j];
     }
   }
    
   //Displays the state of each locker on a separate line
   for(int i = 0; i < lockers.length; i++) {
     if(lockers[i] == true) {
       System.out.println("Locker " + i + " is open");
     }
     else {
       System.out.println("Locker " + i + " is closed");
     }
   }
 }

  
  // Returns an array with n times of each element of ar.
  public static int [] copyIntArray(int [] ar,int n){
    int [] copy = new int[ar.length * n];
    for(int i = 0; i < ar.length; i++){
      for(int j = 0 ; j < n; j++){
        copy [i * n + j] = ar[i];
      }
    }
    return copy;
  }
  
  // Displays the array ar.
  public static void displayIntArray(int [] ar){
   String toPrint = toString(ar);
    
    System.out.println(toPrint);
  }
  //  Converts ar to string.
  public static String toString(int [] ar) {
    String str = "[";
    for (int i = 0; i < ar.length; i++) {
      str = str + ar[i] + " ";
    }
    str = str.trim() + "]";
    return str;
  }
  
  
    
}

