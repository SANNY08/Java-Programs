import java.util.*;
public class palindromee{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int palindrome = sc.nextInt();
        if(ispalindrome(palindrome)){
System.out.print("Number "+palindrome +"is Palindrome");
        }
        else{
            System.out.print("number"+palindrome +"ia not Palindrome");
        }
}
public static boolean ispalindrome(int num){
    int palindrome = num;
    int reverse =0;
int number = num;
    while(palindrome !=0){
        int remainder = palindrome % 10;
        int reverse = reverse * 10 + remainder;
        palindrome = palindrome/10;

    }
    if(palindrome == reverse){
        return true;
    }
    else{
        return false;
    }
}
}