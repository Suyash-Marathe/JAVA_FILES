interface Show {

    default void shownum() {

        System.out.println("Number = 10");
    }
}

public class Interface_2 {

    public static void main(String[] args) {

        Show show = new Show() {
        };

        show.shownum();
    }
}
