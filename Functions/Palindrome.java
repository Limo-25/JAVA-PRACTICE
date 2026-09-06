package Functions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Tell the number: ");
       int n  =  sc.nextInt();
       Rev(n);
       sc.close();
    }

    public static void Rev(int n){
        int Original = n;
        int Rev = 0;
        while (n>0) {
       int LastDigit = n % 10;
       Rev = (Rev*10)+ LastDigit;
       n = n/10; 
        }

        if (Rev==Original) {
            System.out.println("The number is a palindrome."); 
        }
        else{
            System.out.println("The number is not a palindrome.");
        }

    }
    
}
