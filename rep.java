import java.util.*;
public class rep {
    public static boolean twice(int number[]){
        for(int i=0;i<number.length-1;i++){
            for(int j=i+1;j<number.length;j++){
                if(number[i] == number[j]){
                    return true;
                }
            }
        }
        return false;
    }
  public static void main(String args[]){
int number[] = {1,2,2,3,3,4,4,5,5,};
System.out.println(twice(number));
  }  
}
