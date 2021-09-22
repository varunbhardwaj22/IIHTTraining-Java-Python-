//Program to calculate sum of 2 matrices

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
      
//Sum of 2 matrices
      System.out.println("Sum of matrices looks like:");
      int arr3[][]=new int[n1][n2];
       for(int i=0;i<n1;i++){
          for(int j=0;j<n2;j++){
             arr3[i][j]=arr[i][j]+arr2[i][j];
             System.out.print(arr3[i][j]+ " ");
          }
          System.out.println();
      }

      
    }
}