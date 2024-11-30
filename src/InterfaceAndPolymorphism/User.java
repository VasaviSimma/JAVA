package src.InterfaceAndPolymorphism;

public class User {

    String name;
    int id;
    String email;
    char gender;

    public String getDetails() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
