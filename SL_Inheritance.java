class A
{
    void a ()
    {
        System.out.println("It is from class A.");
    }
}

class B extends A
{
    void b ()
    {
        System.out.println("It is from class B.");
    }
}

public class SL_Inheritance
{
    public static void main (String args [])
    {
        B obj = new B();

        obj.a();
        obj.b();
    }
}