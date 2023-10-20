package core.java.method;

public class MethodOverloading {
    public static int max(int x,int y){
        return x>y?x:y;
    }
    public static float max(float x,float y){
        return x>y?x:y;
    }
    public static int max(int x,int y,int z){
        return x>y&&x>z?x:(y>z?y:z);
    }

    public static void main(String[] args) {
        //System.out.println(max(10,20));
       // System.out.println(max(2f,3f));
        System.out.println(max(15,25,50));
    }
}
