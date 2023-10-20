package method.practice;

public class MethodPractice4 {
    public static void change(int x,int newValue){
        x=newValue;
        System.out.println(x);
    }

    public static void main(String[] args) {
        int a=10,newValue=20;
        change(a,newValue);

    }
}
