package method.practice;

public class MethodPractice2 {

    public static void update(int A[],int index,int value){
        A[index]=value;
    }



    public static void main(String[] args) {
        int A[]={2,5,8,10};
        update(A,2,15);
        System.out.println(A[2]);
    }
}
