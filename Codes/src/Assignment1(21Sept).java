
// Assignment : Write a Program to identify if a value is even & is square or multiple of previous value.
//              e.g. first value = 2, then I gave 4 then it should say 4 is a square & multiple of 2
//              e.g. first value = 2, then I gave 6 then it should say 6 is a multiple of 2 = 3s of 2
//              e.g. first value = 2 , then I gave 3 then it should 3 is neither a square nor a multiple of 2
​

import java.util.*;
public class Numbers {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n1= sc.nextInt();
      int n2=sc.nextInt();
      if(n2==(n1*n1)){
          System.out.println(n2+" is a square of "+n1);
      }else{
          if(n2%n1==0){
                     int n3=(n2/n1);
                     System.out.println(n2+" is "+ n3+" multiple of "+n1);
   
          }
          else{
              System.out.println(n2+" is neither square nor multiple of "+n1);
          }
      }
    }
}