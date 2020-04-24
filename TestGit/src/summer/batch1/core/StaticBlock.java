package summer.batch1.core;

public class StaticBlock
{
    //static variables
    static int a;
    static int b;
    static int c;
     
    //static block1 
    static
    {
        System.out.println("I'm in static block 1.");
        a=10;
    }
    //static block2
    static
    {
        System.out.println("I'm in static block 2.");
        b=20;
    }
    //static block3 
    static
    {
        System.out.println("I'm in static block 3.");
        c=30;
    }
    public static void main(String []s)
    {
        System.out.println("Value of a: "+a);
        System.out.println("Value of a: "+b);
        System.out.println("Value of a: "+c);
    }
}