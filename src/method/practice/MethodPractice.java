package method.practice;

public class MethodPractice {

    public static void update(int A[]){
        A[0]=25;
    }


    public static void main(String[] args) {
        int A[]={2,5,8,6};
        update(A);
        System.out.println(A[0]);
    }
}
