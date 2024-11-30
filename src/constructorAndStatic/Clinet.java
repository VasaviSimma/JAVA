package src.constructorAndStatic;

public class Clinet {
    public static void main(String[] args) {

        //this will invoke default constructor if no custom constructor is defined
        User u=new User();

        u.id=2000;
        u.name="Simma";

        //invoking parameterised constructor
        User u2=new User(2000,"Vasavi Simma");

        //can't create a object as below here with one arg as theer is no const defined with 1 arg
        //User u3= new User("Vasavi");

        System.out.println(u2);

        User u3=new User(u2);
        System.out.println(u2);
        System.out.println(u3);
    }
}
