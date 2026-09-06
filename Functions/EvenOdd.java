package Functions;
import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the number which one you wanna check is even or odd : ");
        int n= sc.nextInt();
        isEven(n);
        sc.close();
        
       
    }

    public static void isEven(int n){
        if (n%2==0) {
            System.out.println("The number is Even");
            
        }else{
        System.out.println("The number is odd");
        }
    }
    
}
