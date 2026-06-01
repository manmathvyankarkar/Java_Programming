class Demo
{
    public void fun()
    {
        System.out.println("Inside Demo fun");
    }

    public final void gun()
    {
        System.out.println("Inside Demo gun");
    }
}

class Hello extends Demo
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
        Hello hobj = new Hello();
    }
}

//OUTPUT
//Final_Method.java:16: error: gun() in Hello cannot override gun() in Demo
    //public void gun()
                ^
  //overridden method is final
//1 error
//error: compilation failed