package src.InterfaceAndPolymorphism;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Calculator cal=new Calculator();
        cal.add(10,20);
        cal.add(20,30,40);
        cal.add(40,50,10,20);
        // In the above the call method is getting overloaded based on the
        // no of parameters we are passing
        //It is compile time polymorphism

        Mentor ment=new Mentor();
        System.out.println(ment.getDetails());

        Student stu=new Student();
        System.out.println(stu.getDetails());

        TA ta=new TA();
        System.out.println(ta.getDetails());

        // In the above three calls method getDetails() is getting
        // overridden based on the object we are using to call the method.

        User ment1=new Mentor();
        User TA1=new TA();
        User student1=new Student();

        ValidationService valser=new ValidationService();
        valser.validate(ment1);
        valser.validate(TA1);
        valser.validate(student1);

        // Above is called upcasting as child's objects is getting holded by parent reference
        // varibale, when ever there is a same implementaion that needs to be done for respective child object
        // then we can use upcasting, as we can pass any child's object as the parent reference variable can hold

        System.out.println("enter the user type to get the respective user details; 1:Student 2:TA 3:Mentor");
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        switch (option){
            case 1:

        }
    }
}
