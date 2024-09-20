import java.util.*;
public class avgfn {

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number : ");
    double x = sc.nextDouble();
    System.out.println("Enter the 2nd number : ");
    double y = sc.nextDouble();
    System.out.println("Enter the 3rd number : ");
    double z = sc.nextDouble();
    System.out.println("Average of three number :"+average(x,y,z)+"\n"); 
  }
  public static double average(double x,double y,double z){
    return (x+y+z)/3;
  }
}