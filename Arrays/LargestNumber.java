package Arrays;


public class LargestNumber {
    public static void main(String[] args) {
        int Arr[]={1,2,6,7,99,12,34,55};
        BigNum(Arr);
    }

    public static void BigNum(int Arr[]){
          int Largest = Integer.MIN_VALUE;
          int LargeIndex = 0;
          for(int i=0; i<Arr.length; i++){
            if (Largest<Arr[i]) {
                Largest = Arr[i]; 
                LargeIndex = i;
            } 
          }  
          System.out.print("The largest number is : " +Largest);
          System.out.print("\nThe largest number is at index : " +LargeIndex);
          }
          
    }


