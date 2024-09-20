import java.util.*;
public class pow {
    public static void powerr(double x,double y){
        System.out.print("Power value of :"+Math.pow(x,y));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        double a = sc.nextDouble();
        System.out.print("Enter 2nd number  :");
        double b = sc.nextDouble();
        powerr(a,b);
    }
}
