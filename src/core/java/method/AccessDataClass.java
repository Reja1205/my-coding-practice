package core.java.method;

public class AccessDataClass {
    public static void main(String[] args) {
        DataHiding obj=new DataHiding();
        obj.setLeanth(10);
        obj.setBreath(5);
        System.out.println(obj.area());
        System.out.println(obj.perimeter());

    }
}
