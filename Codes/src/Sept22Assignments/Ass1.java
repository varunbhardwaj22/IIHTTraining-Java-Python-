//Program to construct a 2d matrix based upon size of 2d array

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of rows in matrix");
      int n1=sc.nextInt();
      System.out.println("Enter number of columns in matrix");
      int n2=sc.nextInt();
      int arr[][]=new int[n1][n2];
      System.out.println("Enter elements in matrix");
      for(int i=0;i<n1;i++){
          for(int j=0;j<n2;j++){
              arr[i][j]=sc.nextInt();
          }
      }
//Printing
      System.out.println("Matrix looks like:");
      for(int i=0;i<n1;i++){
          for(int j=0;j<n2;j++){
              System.out.print(arr[i][j]+" ");
          }
          System.out.println();
      }

    }
}