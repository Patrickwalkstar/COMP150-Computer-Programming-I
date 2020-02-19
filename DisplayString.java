public class DisplayString{
  public static void main(String [] args) {
    displayHelloWorld();
    displayHelloWorld();
    displayHelloWorld();
    
    String str = "Hello";
    displayString(str);
    
    displayStringNumTimes(str, 10);
}
  public static void displayHelloWorld(){
    System.out.println("Hello World"); 
    }
  
  public static void displayString(String s) {
    System.out.println(s);
  }
  
  public static void displayStringNumTimes(String s, int num) {
    for(int i = 1; i <= num; i++) {
    System.out.println(s);
    
}
}
}