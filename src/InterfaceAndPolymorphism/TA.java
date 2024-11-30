package src.InterfaceAndPolymorphism;

public class TA extends User{
    int TArSno;

    @Override
    public String getDetails() {
        return "TA{" +
                "TASno=" + TArSno +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                "} " ;
    }
}
