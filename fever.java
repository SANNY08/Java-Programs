import java.util.*;
public class fever {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your body tempture :");
    float temp = sc.nextFloat();
    if(temp>100){
        System.out.println("You have fever");
    }
    else{
        System.out.println("You don't have  fever");
    }
    }
    
}
