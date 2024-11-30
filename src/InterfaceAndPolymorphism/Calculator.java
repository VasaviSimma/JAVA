package src.InterfaceAndPolymorphism;

public class Calculator {
    public void add(int a,int b,int c){
        System.out.println("sum of three values: "+ a+b+c);
    }
    public void add(int a,int b){
        System.out.println("sum of two values: "+ a+b);
    }
    public void add(int a,int b,int c,int d){
        System.out.println("sum of four values: "+ a+b+c+d);
    }
    public void add(int a,int b,int c,int d,int e){
        System.out.println("sum of three values: "+ a+b+c+d+e);
    }
}
