package core.java.method;

public class ObjectAsParameter {

    public static void upDate(int a[]){
        a[0]=25;

    }
    public static void main(String[] args) {
        int a[]={2,3,4,5,6};
        upDate(a);
        System.out.println(a[0]);
    }
}
