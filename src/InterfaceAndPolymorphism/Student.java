package src.InterfaceAndPolymorphism;

public class Student extends User{
    int userSno;

    @Override
    public String getDetails() {
        return "Student{" +
                "userSno=" + userSno +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                "} " ;
    }
}
