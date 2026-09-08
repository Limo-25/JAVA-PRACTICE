package Arrays;

public class binarySearch {

    public static void main(String[] args) {
        int Arr[]= {1,2,3,4,5,6,7,8,9,10,11};
        int Key = 14;
         Search(Arr, Key);
         System.out.print("Index for the Number " +Key+" is : " +Search(Arr, Key));
    }

    public static int Search(int Arr[], int Key){
        int Start = 0;
        int End = Arr.length - 1;

        while (Start <= End) {
           int Mid = (Start + End)/2 ;
       
           if (Arr[Mid] == Key) {
             return Mid;
           }
           if (Arr[Mid] > Key) {
            End = Mid - 1 ;            
           }
           if (Arr[Mid] < Key) {
            Start = Mid + 1;
            
           }
            
        }
     return -1;
       
    }
}