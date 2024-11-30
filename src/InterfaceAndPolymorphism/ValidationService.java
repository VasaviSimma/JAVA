package src.InterfaceAndPolymorphism;

public class ValidationService {

    public void validate(User usr){
        System.out.println("validating users email");
    }

    public void details(User usr){
        usr.getDetails();
    }
}
