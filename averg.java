import java.util.*;
public class averg {
    public static void calavg(double x,double y){
        System.out.print("Average of :"+Math.log(x));
        System.out.print("Average of :"+Math.log(y));
    }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st number :");
    double a = sc.nextDouble();
    System.out.print("Enter 2nd number :");
    double b = sc.nextDouble();
    calavg(a,b);
}
   
}