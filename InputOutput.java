import java.util.*;

public class InputOutput {
    public static void main (String args[])
    {
     
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter first number");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter second number");
        int iNo2 = sobj.nextInt();

        int Ans = 0;
        Ans = iNo1+iNo2;

        System.out.println("Addition is : "+Ans);
        sobj.close();
     
     
     
     
     
    }
}
