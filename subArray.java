import java.util.*;
public class subArray {
    public static void printsubArray(int number[]){
        int total =0;
        int sum = 0;
        for(int i=0;i<number.length;i++){
            int start =i;
            for(int j=i;j<number.length;j++){
                int end =j;
                for(int k=start;k<=end;k++){
                    System.out.print(number[k]+" ");
                  
                }
                
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Array of element :"+total);
    }
    public static void main(String args[]){
        int number[] = {2,4,6,8,10};
        printsubArray(number);
    }
}
