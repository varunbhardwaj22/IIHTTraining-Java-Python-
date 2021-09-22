import java.util.*;
public class SortAscending {    
    public static void main(String[] args) {        
            Scanner sc=new Scanner(System.in);
            int size =sc.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<size;i++){
            int element = sc.nextInt();
            arr[i]=element;
        }    
        int temp = 0;       
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }      
        //Sort the array in ascending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }      
        System.out.println();       
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}    