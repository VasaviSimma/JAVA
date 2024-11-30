package src.InterfaceAndPolymorphism;

public class Mentor extends User{

    int mentorSno;

    @Override
    public String getDetails() {
        return "Mentor{" +
                "mentorSno=" + mentorSno +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                "} " ;
    }
}
