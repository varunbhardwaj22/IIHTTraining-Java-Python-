/*Identify the features of a vehicle via multi level inheritance , 
e.g. if I gave Maruti I should get the specs for it & its a car, if 
I give harley it should give me the specs for it and inform that its a bike*/


import java.util.Scanner;
class Bike{
    public void BvehicleType()
   {
	System.out.println("Vehicle Type: Bike");
   }
   public void Bbrand()
   {
	System.out.println("Brand: Harley Davidson");
   }
   public void Bspeed()
   {
	System.out.println("Max: 150Kmph");
   }
}
class Car extends Bike{
   public void CvehicleType()
   {
	System.out.println("Vehicle Type: Car");
   }
   public void Cbrand()
   {
	System.out.println("Brand: Maruti");
   }
   public void Cspeed()
   {
	System.out.println("Max: 200Kmph");
   }
}public class Vehicle extends Car{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Type the option number to get detail");
        System.out.println("1.Maruti \n2.Harley ");
        int option=sc.nextInt();
        if(option>2 || option<1)
        System.out.println("Invalid option");
        else{
            Vehicle v=new Vehicle();
            if (option==1){
                v.CvehicleType();
                v.Cbrand();
                v.Cspeed();
            }else{
                v.BvehicleType();
                v.Bbrand();
                v.Bspeed();
            }
        }
    }
}