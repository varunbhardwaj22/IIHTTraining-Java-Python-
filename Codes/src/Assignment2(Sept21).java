
// Assignment : Write a Program to calculate the number of digits of a number.
//              e.g. number  = 100 then it should say 3 & then it should calculate the cube if its a multiple of 3 = result = 3,27
//              e.g. number = 1000 then it should say 4 & then it should calculate the square since 4/2 is remainder = 0 = result = 4,16
//              e.g. number = 10000 then it should say 5 & then it should calculate the square of the nearest smallest even number = 5[4],16
//              e.g. number = 100000 then it should say 6 & then it should calculate the square of 6 = 6,36
//              [Exceptional cases when number is divisible by 2 & 3 ,2 shall have higher precedence over 3]
// NOTE : Incase of values less than 2 return the same value e.g. 8, = result = 1

import java.util.*;
import java.lang.Math;

public class Numbers {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int num= sc.nextInt();
      int count=0;
      int result;
      if(num<2){
                       System.out.println(num);
      }else{
      while(num!=0){
          num=num/10;
          count++;
      }
                 if(count%2==0){
                    result=(int)Math.pow(count,2); 
                    System.out.println(count+","+result);

                 }else if(count%3==0){
                    result=(int)Math.pow(count,3); 
                    System.out.println(count+","+result);
                 }else{
                     result=(int)Math.pow((count-1),2); 
                     System.out.println(count+"["+(count-1)+"],"+result); 
                 }
                }
    
    }
}