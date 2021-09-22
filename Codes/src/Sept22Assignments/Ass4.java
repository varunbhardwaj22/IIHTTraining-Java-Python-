//Program to check identical matrices or not

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of rows in matrix1 & matrix2");
      int n1=sc.nextInt();
      System.out.println("Enter number of columns in matrix1 & matrix2");
      int n2=sc.nextInt();
      int arr[][]=new int[n1][n2];
      System.out.println("Enter elements in matrix1");
      for(int i=0;i<n1;i++){
          for(int j=0;j<n2;j++){
              arr[i][j]=sc.nextInt();
          }
      }
      
//Printing Matrix 1
      System.out.println("Matrix 1 looks like:");
      for(int i=0;i<n1;i++){
          for(int j=0;j<n2;j++){
              System.out.print(arr[i][j]+" ");
          }
          System.out.println();
      }

    
      int arr2[][]=new int[n1][n2];
      System.out.println("Enter elements in matrix2");
      for(int i=0;i<n1;i++){
          for(int j=0;j<n2;j++){
              arr2[i][j]=sc.nextInt();
          }
      }
      
//Printing Matrix 2
      System.out.println("Matrix 2 looks like:");
      for(int i=0;i<n1;i++){
          for(int j=0;j<n2;j++){
              System.out.print(arr2[i][j]+" ");
          }
          System.out.println();
      }
      
//Checking if matrices are identical or not
      int arr3[][]=new int[n1][n2];
      int count=0;
       for(int i=0;i<n1;i++){
          for(int j=0;j<n2;j++){
             if(arr[i][j]==arr2[i][j])
             count++;
          }
      }
      if(count==(n1*n2))
      System.out.println("Identical Matrices");
      else{
        System.out.println("Final Matrix looks like:");
          for(int i=0;i<n1;i++){
          for(int j=0;j<n2;j++){
             if(arr[i][j]==arr2[i][j])
             arr3[i][j]=0;
             else
             arr3[i][j]=arr[i][j];
             System.out.print(arr3[i][j]+ " ");
          }
          System.out.println();
      }
      }
      
    }
}