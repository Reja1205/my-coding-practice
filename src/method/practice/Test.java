package method.practice;

public class Test {
    int x;
    int y;
    static int  max(int x,int y){
        y++;
       if (x>y)
           return x;
       else
           return y;


    }
    public static void main(String[] args) {
       int a=10,b=10, c;
       c=max(a,b);
        System.out.println(c);


    }
}
