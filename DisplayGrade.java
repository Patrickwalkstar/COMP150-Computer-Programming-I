import java.util.Scanner;
  public class DisplayGrade
  {
    public static void main (String [] args)
       {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter score 1 and percent 1: ");
      double score1 = input.nextDouble();
      double percent1 = input.nextDouble();
      
      System.out.print("Enter score 2 and percent 2: ");
      double score2 = input.nextDouble();
      double percent2 = input.nextDouble();
      
      System.out.print("Enter score 3 and percent 3: ");
      double score3 = input.nextDouble();
      double percent3 = input.nextDouble();
      
      if(percent1 + percent2 + percent3 != 100){
        System.out.println("Bad input");
      }
      else {
        double weightedAvg = ((score1 * percent1 + score2 * percent2 + score3 * percent3)/100);
        if(weightedAvg >= 90) {
          System.out.println("Grade is A");
        }
        else if(weightedAvg >= 80){
          System.out.println("Grade is B");
        }
        else if(weightedAvg >= 65){
          System.out.println("Grade is C");
        }
        else if(weightedAvg >= 55){
          System.out.println("Grade is D");
        }
        else{
          System.out.println("Grade is F");
        }
      }
    }
  }
      
      