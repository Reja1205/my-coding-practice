package control.flow;

public class StringDemo {
    public static void main(String[] args) {

        String n1="Rejaur";
        String n2=n1;//n2=Rejaur
        n2="Rahman";//Create a nnew  value in the string pool
        n2=n1+n2;
        System.out.println(n2);

        int a=5;
        int a2=a;
        a2=a+a2;
        System.out.println(a2);



    }
}
