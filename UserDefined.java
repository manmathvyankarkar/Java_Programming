import java.io.*;

class UserDefined
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your Age :");
        int Age = sobj.nextInt();

        try
        {
            if(Age<18){
                throw new AgeInvalid("You are Under Age");
            }else{
                System.out.println("You Can Attend The Session");
            }
        }
        catch()
        {
            System.out.println("Inside Catch Block :"+aobj);
        }
    }
}