package src.sample;

class User{
    String name;
    int id;
    long contactnum;

    public void details(){
        System.out.println("Name: "+ this.name + ", Id: "+ this.id + ", ContactNum: " + this.contactnum);
    }

}