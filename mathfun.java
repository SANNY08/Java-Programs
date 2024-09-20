import java.util.*;
public class mathfun {
    public static void math(double no,double no1){

System.out.println(Math.min(no,no1));

    }
  public static void main(String arrgs[]){
    System.out.print("Enter first number :");
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    System.out.print("Enter first number :");
    double b = sc.nextDouble();
   math(a,b);
   

  }  
}
