class Demo
{
    public int i;
    public int j;
    public static int k;

    static
    {
        System.out.println("Inside static block");
        int k = 51;
    }

    public Demo()
    {
        System.out.println("Inside Constructor");
        this.i = 11;
        this.j = 21;
    }

    public void fun()
    {
        System.out.println( "Inside fun");
        System.out.println( "this.i");
        System.out.println( "this.j");
        System.out.println( "Demo.k");
    }

    public static void gun()
    {
        System.out.println("Inside gun");
        System.out.println("Demo.k");
        System.out.println(k);
    }
}

class StaticDemo
{
    public static void main(String A[])
    {
        System.out.println("Inside main");

        System.out.println("Value of k : "+Demo.k);

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.fun();
        dobj2.gun();
    }
}