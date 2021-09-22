// Write a program to generate fibonacci series with 2 different functions

public class Fibonacci {
    int a=0;
    int b=1;
    
    public int getfib(int i)
    {
        if(i==0)
            return a;
        else if(i==1)
            return b;
       else if(i%2==0)
            return fib1();
        else
            return fib2();
    }
    public int fib1()
    {
         int  c = a+b;
     this.a=b;
     this.b=c;
        return c; 
    }
    public int fib2()
    {
         int  c = a+b;
     this.a=b;
     this.b=c;
        return c; 
    }
    }