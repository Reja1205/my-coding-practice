package control.flow;

public class StringDemo2 {
    public static void main(String[] args) {
        char a[]={'H','e','l','l','o'};
        String str=new String(a);
        //System.out.println(str);
        String str1= new String("Java") ;
        str1=str1.concat(" Program");
        //System.out.println(str1);

        String str2="Java Program";
       // str2= str2.toUpperCase();
        //System.out.println(str2);

        int n=str2.length();
       // System.out.println(n);

       // str2=str2.substring(5);
        //System.out.println(str2);

       // str2=str2.substring(5,12);
       // System.out.println(str2);

        str=str2.replace('J','j');
        System.out.println(str2);
    }
}
