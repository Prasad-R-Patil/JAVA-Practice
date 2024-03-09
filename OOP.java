import java.util.*;


public class OOP {
    public static void main (String args[])
    {

        int iNo1 = 0;
        int iNo2 = 0;
        int Ans = 0;

            Scanner sobj  = new Scanner(System.in);

            System.out.println("Enter the First no");
            iNo1 = sobj.nextInt();

            System.out.println("Enter the Second no");
            iNo2 = sobj.nextInt();


            Arithematic aobj = new Arithematic(iNo1,iNo2);

            Ans = aobj.Addition();
            System.out.println("Addition is : "+Ans);

            Ans = aobj.multiplaction();
            System.out.println("multiplaction is : "+Ans);

            sobj.close();
    }
}

class Arithematic
{
        public int value1;
        public int value2;

        public Arithematic(int A, int B)
        {
            this.value1 = A;
            this.value2 = B;

        }

        public int Addition()
        {
            int result =0;
            result = this.value1 + this.value2;
            return result;
        }
        public int multiplaction()
        {
            int result =0;
            result = this.value1 * this.value2;
            return result;
        }




};