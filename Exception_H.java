public class Exception_H {
    
    public static void main(String[] args) {

            int a = 10, b = 0;
            int div;

            try {

                div = a / b;
                System.out.println("Result: " + div);
            }
            catch (Exception e) {

                System.out.println("Divivded by zero is not possible");
            }
    }
}
