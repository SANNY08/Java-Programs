import java.util.*;
public class allpattern {
    public static void high(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
       
    }
    // Hollow rectangle

    public static void holllow(int c,int r){                               /*****
                                                                            *   *  
                                                                            *****/
        for(int i=1; i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || i==r || j==1||j==c ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    //INVERTED ROTATED HALF-PIRAMID
    public static void half_pyramid(int n){
for(int i=1 ;i<=n ;i++){
    for(int j=1 ;j<=(n-i+1) ;j++){
        System.out.print(" ");
    }
    for(int j=1 ;j<=i ;j++){
        System.out.print("*");
    }
    System.out.println();
}
    }


    //INVERTED HALF-PYYRAMID WITRH NUMBER
    public static void inverted_half(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i+1);j++){
            System.out.print(j);
            }
            System.out.println();
        }
    }


    //FLOYD'S TRIANGLE
    public static void floyd(int n ){
        int counter =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }


    // 0 - 1 TRIANGLE
    public static void zero_one(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }


    //REVERSE OF 0 - 1 
    public static void zero(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i+1);j++){
                System.out.print(" ");
                
            }
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    //BUTTERFLY PATTERN
    public static void butterfly(int n){
        //STAR 1
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //SPACE 2*(N-1)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2ND HALF
        for(int i=n;i>=1;i--){
            //STAR 1
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //SPACE 2*(N-1)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 

    // DIAMOND PATTERN
    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            //SPACE
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //STAR
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        //2nd half
        for(int i=n;i>=1;i--){
            //space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //STAR
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //SOLID RAHOMBUS
    public static void solid(int n){
        for(int i=1;i<=n;i++){
            //SPACE
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //STAR
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //HOLLOW RHOMBUS
    public static void hollowrm(int n){
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //STAR
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        //high(5);
        //holllow(5,6);
        //half_pyramid(4);
        //inverted_half(5);
       // floyd(5);
        //zero_one(5);
        //zero(5);
        //butterfly(4);
        //diamond(5);
        //solid(5);
        hollowrm(5);
    }
}
