package method.practice;

public class MethodPractice3 {
    static void changeValue(int value){
       value=value+10;



    }

    public static void main(String[] args) {
        int num=10;
        changeValue(num);
        System.out.println(num);



    }
}
