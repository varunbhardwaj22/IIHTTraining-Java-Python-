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