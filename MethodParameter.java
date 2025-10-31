public class MethodParameter {

    public static void main(String[] args) {
        sayHello("Firah", "Putri");
        sayHello("Kyungsoo", "Woobin");

    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
