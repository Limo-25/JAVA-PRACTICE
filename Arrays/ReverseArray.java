package Arrays;
public class ReverseArray {

    public static void main(String[] args) {
         int Arr[]={1,2,6,7,10,12,34,55};
         Reverse(Arr);

         

         for(int i = 0; i < Arr.length ; i++ ){
         System.out.print( Arr[i] + " ");
         }
    }

    public static void Reverse(int Arr[]){
        int start = 0 ;
        int end = Arr.length - 1 ;

        while (start < end) {
            int temp = Arr[start];
            Arr[start] = Arr[end];
            Arr[end] = temp ;

             start++ ;
             end -- ;
             
        }
       
    }
}