package core.java.method;

public class ConstractorDemo {
   private int leanth;
   private int breath;

    public ConstractorDemo(){
        leanth=1;
        breath=1;

    }

    public int getLeanth(){
        return leanth;
    }

    public ConstractorDemo(int l,int b){
        leanth=l;
        breath=b;

        System.out.println(2*(leanth*breath));
    }



    public static void main(String[] args) {
        ConstractorDemo obj=new ConstractorDemo(10,5);
        //System.out.println(obj.getLeanth());

    }

}
