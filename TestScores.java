import java.util.Scanner;
//some number of students
// print out max test score (and name)

public class TestScores{
  public static void main(String[] args) {
    //Get Scanner
    Scanner stdin = new Scanner(System.in);
    System.out.print("Enter number of students: ");
    int numStudents = stdin.nextInt();
      
      String name;
      int score;
      String maxName;
      int maxScore;
      int sumScores = 0;
        
        //Read in the first student score
        System.out.println("Name ");
        maxName = stdin.next();
        System.out.println("Score: ");
        maxScore = stdin.nextInt();
        sumScores = maxScore;
        
        int count = 1;
        while (count <= numStudents - 1) {
        
        System.out.println("Name ");
        name = stdin.next();
        System.out.println("Score: ");
        score = stdin.nextInt();
        if (score > maxScore) {
          maxScore = score;
          maxName = name;
        }
        sumScores += score;
        
        count++;
       }

       System.out.println("Name: "+ maxName + "." + " Score: " + maxScore + ".");

        
        double avg = (double) sumScores / numStudents;
        System.out.println("Average Score of all students: " + avg + ".");
     }
   }