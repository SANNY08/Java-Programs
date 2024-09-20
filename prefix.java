// import java.util.*;
// public class prefix {
//     public static void maxsubarraysum(int numbers[]){
//         int currsum=0;
//         int maxsum = Integer.MIN_VALUE;
//         int prefix[] = new int[numbers.length];

//         prefix[0] = numbers[0];
//         for(int i=1;i<prefix.length;i++){
//             prefix[i] = prefix[i-1]+numbers[i];
//         }


//             for(int i=0;i<numbers.length;i++){
//                 int start = i;
//                 for(int j=i;j<=numbers.length;j++){
//                     int end = j;
//                     currsum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];

//                     if(maxsum < currsum){
//                         maxsum = currsum;
//                     }
//                 }
//             }

//         System.out.println("Max sum = "+maxsum);
//     }


//     public static void main(String args[]){
//         int numbers[] = {1,-2,6,-1,3};
//         maxsubarraysum(numbers);
//     }
// }
import java.util.*;
public class prefix {
    public static void maxsubArraysum(int numbers[]){
        int currsum=0;
        int maxsum = Integer.MIN_VALUE;
        int
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                currsum = 0;
                for(int k=start;k<=end;k++){
                    currsum +=numbers[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum = currsum;
                }
            }

        }
        System.out.println("Max of Sum = "+maxsum);
    }
    public static void main(String args[]){
        int numbers[] = {1,-2,6,-1,3};
        maxsubArraysum(numbers);
    }
}
