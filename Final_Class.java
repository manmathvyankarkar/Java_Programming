final class Demo
{
    public void fun()
    {
        System.out.println("Inside Demo fun");
    }

    public void gun()
    {
        System.out.println("Inside Demo gun");
    }
}

class Hello extends Demo                //ERROR
{
    public void gun()
    {
        System.out.println("Inside Hello gun");
    }
}

class Final_Method
{
    public static void main(String A[])
    {
        Demo dobj = new Demo;       //ALLOWED
        
        Hello hobj = new Hello();
    }
}