import java.util.*;
public class ternary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String type = (number>=33)?"PASS":"FAIL";
        System.out.println(type);
    }
}