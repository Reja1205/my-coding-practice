package core.java.method;

public class MethodPractice {
  //Find the max of two number
    // Main method and method variable are separate only value is copied inse the parameter of a method

    public static int max(int x,int y){
        return x>y?x:y;

    }

    public static void main(String[] args) {
       int a=5,b=15,c;
        c=max(a,b);
        System.out.println(c);
    }

}
