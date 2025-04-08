interface A {

    default void show() {

        System.out.println("Java");
    }
}

class B implements A {


}

public class Interface_3 {

    public static void main(String[] args) {
        
        B obj = new B();
        obj.show();
    }
}