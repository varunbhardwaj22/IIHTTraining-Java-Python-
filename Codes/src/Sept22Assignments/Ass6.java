//Write a program to show the heirloom  + personal assets for 3 generations, note every generation will add some of its own.

class IndianCricket
{
        String a="India started playing cricket";
}class KapilDev extends IndianCricket
{
    String b="India won 1983 world cup under Kapil";
}class Ganguly extends KapilDev
{
    String c="India won 2002 champions trophy under Ganguly";
}public class MSDhoni extends Ganguly
{
    public static void main(String args[])
    {
            MSDhoni msd=new MSDhoni();
            String d="India won 2007 t20,2011 world cup and 2013 champions trophy under Dhoni";
            System.out.println(msd.a);
            System.out.println(msd.b);
            System.out.println(msd.c);
            System.out.println(d);
    }
}