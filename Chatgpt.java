class Test {
    public static int x = 0;
    public int y = 0;
    static
    {
        x = 20;
    }

    public Test()
    {
        this.y = 10;
    }


    public static void main(String[] args) {
        System.out.println(x);

        Test tobj = new Test();

    }
}