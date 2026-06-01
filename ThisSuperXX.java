class Base
{
    public int i;

    public Base()
    {
        System.out.println("Inside Base Construtor");
        this.i = 11;
    }

    public void fun()
    {
        System.out.println("Inside Base fun");
    }
}

class Derived extends Base
{
    public int i;


    public Derived()
    {
        System.out.println("Inside Derived construtor");
        this.i = 21;
    }

    public void gun()
    {
        System.out.println("Inside Derived gun");
        System.out.println("Value of i :"+i);
        System.out.println("Value of i from Base :"+super.i);
    }
}

class ThisSuperXX
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();

        dobj.gun();
    }
}

//Compile : javac Single.java
//Run : java Single

//Compile + Run : java Single.java