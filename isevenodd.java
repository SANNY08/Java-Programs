import java.util.*;
public class isevenodd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        if(iseven(n)){
            System.out.print("NUmber is Even ");
        }
        else{
            System.out.print("NUmber is odd ");
        }
    } 
    public static boolean iseven(int x){
        if(x % 2==0){
            return true;
        }
        else{
            return false;
        }
    }
}