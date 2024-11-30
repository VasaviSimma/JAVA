package src.encapsulation;

public class DemoEncapsulation {
    String name; //default access specifier
    public int id; //public access specifier

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    private long num; //private access specifier

    public String toString(){
        return this.name + "; " + this.id + this.num;
    }
}
