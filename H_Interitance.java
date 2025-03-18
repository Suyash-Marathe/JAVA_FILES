class A 
{
    void a ()
    {
        System.out.println("A");
    }
}

class B extends A 
{
    void b ()
    {
        System.out.println("B");
    }
}

class C extends A 
{
    void c ()
    {
        System.out.println("C");
    }
}

public class H_Interitance {

    public static void main (String args[])
    {
        C obj = new C();
        B obj2 = new B();

        obj.a();
        obj.c();

        obj2.a();
        obj2.b();
    }
    
}
