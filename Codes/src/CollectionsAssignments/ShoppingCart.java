// Assignment : Build a Shopping Cart for a customer , ensure to allow adding items to the cart only when they are in stock

import java.util.*;
public class Coll
{
    public static void main(String arghs[])
    {
        List<String> Shop = new ArrayList<String>();
        Shop.add("Shoes");
        Shop.add("TShirt");
        Shop.add("Shirt");
        Shop.add("Jacket");
        Shop.add("Tie");
        
        List<String> MyCart=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        System.out.println("How many items you want to buy:");
        int num=sc.nextInt();
        System.out.println(num);
        System.out.println("Select items that you want to add in cart from: \nShoes TShirt Shirt Jacket Tie");
        for(int i=0;i<num;i++){
            String item=sc.next();
            if(Shop.contains(item)){
             MyCart.add(item);   
            }else{
                System.out.println(item+" is out of stock");
            }
        }
        //Display My Cart
        System.out.println("Final items in your cart");
        for(String i:MyCart){
            System.out.print(i+" ");
        }
    }
}