// Assignment : Write a Program to identify the duplicates & the number of occurrences.
//              e.g. [1,2,2,4,8,9,8,7,7,7,8] =
//              Expected :
//  Step 1 :            [1], [2,2], [4], [8,8,8], [9], [7,7,7]
//  Step 2 :            [9],[8,8,8],[7,7,7],[4,4,4,4]....  [sorted order]
//  Step 3 :            [4,4,4,4],[8,8,8],[7,7,7],[9].... [sort based on no. of occurrences & then natural sort]

import java.util.*;
 
public class Occurences {  
        
    //Step 1 function
    static void occurences(int arr[], int n){
        boolean visited[] = new boolean[n];
        for (int i = 0; i < n; i++)
        {
            visited[i] = false;
        }
        for (int i = 0; i < n; i++)
        {
            if (!visited[i]){
                System.out.print(arr[i] + " ");
                for (int j = i + 1; j < n; j++)
                {
                    if (arr[i] == arr[j]) {
                        System.out.print(arr[i] + " ");
                        visited[j] = true;
                    }
                }
            }
        }
    }
   
    //Step 2 function    
    static void sortDescend(int arr[]){
        int temp = 0;    
            for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
    }   
    
    //Step 3 function
    static void sortByfreq(int arr[]){
       System.out.println("Not able to do this step without using hashmap");
     }
        
    
    //Main function
    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int [size];  
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            }
            
        //Displaying elements of original array    
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }
                
        System.out.println();  
        System.out.println();
        System.out.println("Result after Step 1:");
        
        //Step 1 function call
        occurences(arr,size);                                
        
        System.out.println();
        System.out.println();
        System.out.println("Result after Step 2:");
        
        //Step 2 function call
        sortDescend(arr);                                    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }
        System.out.println();
        System.out.println();
        
        //Step3 function call
        System.out.println("Result after Step 3:");
        sortByfreq(arr);
        
    }
}