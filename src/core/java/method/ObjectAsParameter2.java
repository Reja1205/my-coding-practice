package core.java.method;

public class ObjectAsParameter2 {

    public static void welCome(String name){
        System.out.println("Welcome Mr "+name);
    }
    public static void main(String[] args) {
        String name="John";
        welCome(name);

    }
}
