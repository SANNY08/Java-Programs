import java.util.*;
public class fnavg {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        int x = sc.nextInt();
        System.out.print("Enter 2nd number :");
        int y = sc.nextInt();
        System.out.print("Enter 3rd number :");
        int z = sc.nextInt();
        System.out.print("Average is :"+average(x,y,z)+"/n");
    }
    public static int average(int x,int y,int z){
        return (x+y+z)/3;
    }
}
