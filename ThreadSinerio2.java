class Demo implements Runnable
{
    public void run()
    {
        System.out.println("Inside run method");
    }
}

class ThreadSinerio2
{
    public static void main(String A[])
    {
        System.out.println("Main Thread is running....");

        Demo dobj = new Demo();

        Thread tobj = new Thread(dobj);

        tobj.start();
    }
}