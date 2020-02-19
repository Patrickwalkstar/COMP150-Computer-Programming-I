import java.util.Scanner;

public class TwoDArrayBasics{
  public static void main (String [] args){
    //Get Scanner
    Scanner input = new Scanner(System.in);
    //Declare a 2D array of ints
    int [][] ar2d;
    
    // Create a 2D array
    ar2d = new int [3][5];
    
    //Initialize the array from user input.
    for(int row = 0; row < ar2d.length; row++){
      for(int col = 0; col < ar2d[row].length; col++){
        System.out.print("Enter vl for row " + row + " and column " + col + ": ");
       //ar2d[row][col] = input.nextInt();
        ar2d[row][col] = row + col;
      }
    }
    //Declare, create, and initialize a 2d array with an initialization list.
    int [][] ar2d2 = 
    { {1, 2, 3, 4, 5},
      {5, 4, 3, 2, 1}, 
      {10, 11, 12, 13, 14}};
    
    int [][] ar = {{1, 9, 3, 5, 10, 4},
      {3, 12, 3, 8, 13, 45},
      {38, 1, 4, 9, 2, 9}};
   int n =  numLocalMaxima(ar);
   System.out.println("Num local maxima = " + n);
  }

  public static int numLocalMaxima(int[][] ar) {
    int count = 0;
    for(int r = 0; r < ar.length; r++){
      for(int c = 0; c < ar[r].length; c++){
        int numNeighbors = 0, numLessThanMe = 0;
          //Check up
          if(r > 0){
          numNeighbors++;
          if(ar[r][c] > ar[r-1][c])
            numLessThanMe++;
        }
          //Check right
          if(c > ar[r].length - 1){
          numNeighbors++;
          if(ar[r][c] > ar[r][c + 1])
            numLessThanMe++;
        }
          //Check below
          if(r < ar.length - 1){
          numNeighbors++;
          if(ar[r][c] > ar[r + 1][c])
            numLessThanMe++;
           }
          //Check left
          if(c > 0){
          numNeighbors++;
          if(ar[r][c] > ar[r][c - 1])
            numLessThanMe++;
          }
          if(numNeighbors == numLessThanMe)
            count++;
      }
    }
    return count;
  }
}
          
                                             