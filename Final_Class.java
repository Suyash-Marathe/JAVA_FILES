final class A {

    final int A = 10;

    final void show () {

        System.out.println("Number = "+ A);
    }
}

public class Final_Class {

    public static void main(String[] args) {
        
        A obj = new A();

        obj.show();    
    }
}
