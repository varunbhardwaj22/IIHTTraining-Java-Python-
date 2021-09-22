import java.util.*;
public class index {
 
    public static int findIndex(int arr[], int t)
    {
        // if array is Null
        if (arr == null) {
            return -1;
        }
        // find length of array
        int len = arr.length;
        int i = 0;
 
        // traverse in the array
        while (i < len) {
 
            // if the i-th element is t
            // then return the index
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
            int size =sc.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<size;i++){
            int element = sc.nextInt();
            arr[i]=element;
        }    
        System.out.println("Enter the element you want to search");
        int x = sc.nextInt();
        System.out.println("Index position of " + x + " is: "
                           + findIndex(arr, x));
 
    }
}