class Demo
{
    public int Addition(int A, int B)               //Addition@2ii
    {
        return A+B;
    }

    public double Addition(double A, double B)      //Addition@2dd
    {
        return A+B;
    }

    public float Addition(float A, float B, float C)    //Addition@3fff
    {
        return A+B+C;
    }
}

class Overloading
{
    public static void main(String A[]);

    Demo dobj = new Demo();

    System.out.println(dobj.Addition(A: 10,B: 11));
    System.out.println(dobj.Addition(A: 10.89,B: 20.45));
    System.out.println(dobj.Addition(A: 23.5f,C: 30.2f));
}