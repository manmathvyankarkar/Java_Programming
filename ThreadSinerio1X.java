class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside run method");
    }
}

class Multithreading1
{
    public static void main(String A[])
    {
        System.out.println("Main Thread is running....");

        Demo dobj = new Demo();
        
        Thread tobj = new Thread(dobj);

        tobj.start();
    }
}