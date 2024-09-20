import java.util.*;
public class item {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
float pencil = sc.nextFloat();
float pen    = sc.nextFloat();
float eraser = sc.nextFloat();
float gst = (pencil + pen + eraser)*18/100;
float cost   = pencil + pen + eraser + gst;
System.out.println("Total gst :"+gst);
System.out.println("Bill with 18% tax  :"+cost);
    }
}
