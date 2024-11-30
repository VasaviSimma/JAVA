package src.constructorAndStatic;

public class User {
    int id;
    int seNo;
    String name;

    //when we don't have any constructor java will provide this default constructor
    //It creates an object with all data members as default values.
/*    public User(){
    }*/

    //No arg constructor
    public User(){
        this.id=1000;
        this.name="vasavi";
    }

    //parameterised constructor
    public User(int id,String name){
        this.id=id;
        this.name=name;
    }

    //Copy constructor is used when we want to crate a new object with most of the data same as existing object
    //instead of giving same values again and again to create new objects, this copy constructor can be used
    //This will create a new object from the existing object's data
    public User(User user){
        this.seNo+=1;
        this.id=user.id;
        this.name=user.name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", seNo=" + seNo +
                ", name='" + name + '\'' +
                '}';
    }
}

//Adding any custom constructor will no longer provide the default constructor provided by java.