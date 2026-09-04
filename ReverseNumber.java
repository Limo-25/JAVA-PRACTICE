import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Tell the number: ");
       int n  =  sc.nextInt();
       int Rev = 0;
     while (n>0) {
        int LastDigit = n % 10;
       Rev = (Rev*10)+ LastDigit;
       n = n/10;
       
        
     }
     System.out.print(Rev);

       
       sc.close();
    }
}
