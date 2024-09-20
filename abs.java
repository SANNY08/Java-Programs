import java.util.Scanner;

public class abs {
   public static void absolute(double no){
    System.out.print("Absolute of :"+Math.abs(no));
   }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number :");
    double a = sc.nextDouble();
    absolute(a);
  } 
    
}
