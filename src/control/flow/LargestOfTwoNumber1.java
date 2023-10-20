package control.flow;

public class LargestOfTwoNumber1 {
    //Find the Largest of two number
    //num1=15,num2=7

    public static void main(String[] args) {
        int num1=15;
        int num2=7;
        int largest;

        if(num1>num2){
            largest=num1;
        }
        else{
            largest=num2;
        }
        System.out.println("The largest of two number is "+largest);
    }
}
