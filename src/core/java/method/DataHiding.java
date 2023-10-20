package core.java.method;

public class DataHiding {
    private int leanth;
    private int breath;

    public int getLeanth(){
        return leanth;
    }

    public void setLeanth(int l){
        leanth=l;

    }

    public int getBreath(){
        return breath;
    }

    public void setBreath(int b){
        breath=b;
    }

    public int  area(){
      return leanth*breath;
    }

    public   int perimeter(){
        return 2*(leanth*breath);
    }
}
