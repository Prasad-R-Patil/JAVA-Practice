



public class Encapsulation {
    public static void main (String args[])
    {
        System.out.println("Inside the main");

        Demo dobj1 = new Demo();
        Demo dobj2= new Demo(11,21);

        System.out.println(dobj2.i);
        System.out.println(dobj2.j);

        dobj1.fun();









    }


    
}












class Demo
{
    public int i;
    public int j;

    public Demo()
    {
        System.out.println("inside defult constructor");
        this.i=0;
        this.j=0;
    }

    public Demo(int a ,int b)
    {
        System.out.println("inside parameterised constructor");
        this.i = a;
        this.j = b;
    }

    public void fun()
    {
        System.out.println("Inside fun method");
    }


};

