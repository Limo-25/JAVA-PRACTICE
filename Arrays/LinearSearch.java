package Arrays;
import java.util.*;
public class LinearSearch {
     public static void main(String[] args) {
        int Arr[]={1,2,6,7,10,12,34,55};
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the number you wanna search on this array: ");
        int Key = sc.nextInt();
        search(Arr, Key);
        sc.close();
        
     }

     public static void search(int Arr[], int Key){
          for(int i=0; i<=Arr.length; i++){
            if (Key==Arr[i]) {
                System.out.print("The number found at index : " +i);
                return;
            }
           
          }
       System.out.print("This number does not exist in this Array,");
     }
}

//    TIME COPLEXITY = O(n);