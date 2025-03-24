interface A {
    void a()
    {
        System.out.println("A");
    }
}

interface B {
    void b()
    {
        System.out.println("B");
    }
}

class C extends A, B { /

    void c() {
        System.out.println("C");
    }
}

public class HB_Inheritance {
    public static void main(String[] args) {
        C obj = new C();

        obj.a(); // From Interface A
        obj.b(); // From Interface B
        obj.c(); // From Class C
    }
}