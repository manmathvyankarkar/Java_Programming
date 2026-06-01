abstract class Demo
{
    public int i, j;

    public int Add(int a, int b)        //Concrete Method
    {
        return a+b;
    }

    public abstract int Sub(int a, int b)
    {
        
    }
}

class Hello extends Demo
{
    public int Sub(int a, int b)
    {
        return a-b;
    }
}

class Abstract_Demo_Complete  
{
    public static void main(String A[])
    {
       Hello hobj = new Hello();

       System.out.println(hobj.Add(int a, int b));
       System.out.println(hobj.Sub(int a, int b));
    }
}