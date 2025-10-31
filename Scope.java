public class Scope {
    public static void main(String[] args) {
        sayHello("Hana");
    }
    static void sayHello(String name){
        String hello = "Hello " + name;

        if(!name.isBlank()){ //if name tidak sama dengan blank
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        System.out.println(hello);
       // System.out.println(hi); //error karena method 'hi' diluar scope
    }
}
