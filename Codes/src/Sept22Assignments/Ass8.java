/*Write a program to calculate the cost of spares to make a car */


import java.util.Scanner;
class Bentley{
    int wheels=4;
    int glasses=2;
    int doors=2;
    int costw=10000;
    int costg=20000;
    int costd=40000;
    int costB=(wheels*costw)+(glasses*costg)+(doors*costd);
}
class Polo extends Bentley{
   int wheels=4;
   int glasses=4;
   int doors=4;
   int costw=12000;
    int costg=25000;
    int costd=41000;
        int costP=(wheels*costw)+(glasses*costg)+(doors*costd);

}public class Trailer extends Polo{
    public static void main(String args[]){
        int wheels=12;
        int glasses=2;
        int doors=2;
        int costw=4000;
        int costg=24000;
        int costd=45000;
        int costT=(wheels*costw)+(glasses*costg)+(doors*costd);

        Scanner sc=new Scanner(System.in);
        System.out.println("Type the option number to get detail");
        System.out.println("1.Bentley \n2.Polo \n3.Trailer ");
        int option=sc.nextInt();
        Trailer t=new Trailer();
        if(option>3 || option<1)
        System.out.println("Invalid option");
        else{
            System.out.print("Total cost will be:\n");
            if(option==1){
                System.out.println(t.costB);
            }else if(option==2){
                System.out.println(t.costP);
            }else{
                System.out.println(costT);
            }
        }
        }
    }
