package src.encapsulation;

public class Client {
    public static void main(String[] args) {
        DemoEncapsulation de= new DemoEncapsulation();
        de.name="vasavi";
        de.id=12345;
        //de.num; it will not be accessible as it is private
        System.out.println(de);

        //private attributes can be accessed with the help of getter and setter
        de.setNum(82773687);
        System.out.println(de.getNum());
    }
}

//public - can be accessible everywhere
//Default - can be accessed inside the package
//private - can be accessed only inside the class.