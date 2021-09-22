// Assignment : Write a Program to identify the correct integer / float type based on the input accepted from the user.
//              e.g. if a user enters 1000 it should be prompted as short,int long but recommended as short
//              e.g. if a user enters 35000 it should be prompted as int, long but recommended as int
//              e.g. if a user is prompted with 9.10 it should be prompted with float, double but recommended as float

import java.util.Scanner;
public class hasNextNumberDemo
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Data :");
        int n;
        if(in.hasNextInt()){
            n=in.nextInt();
            if(n>=-32768 && n<=32676)
            System.out.println("You have entered an Integer as : " + in.nextInt()+" but we recommend to use short");
            else if(n>=-9223372036854775808 && n<= 9223372036854775807)
            System.out.println("You have entered an Integer as : " + in.nextInt()+" but we recommend to use long");
            else if(n>=-2147483648 && n<= 2147483647)
            System.out.println("You have entered an Integer as : " + in.nextInt()+" and we recommend to use int");

        }else if(in.hasNextFloat())
            System.out.println("You have entered an Float Value as : " + in.nextFloat()+" and we recommend float");
        else 
            System.out.println("Token not an Integer or a real value.");
        
   }
   
}
