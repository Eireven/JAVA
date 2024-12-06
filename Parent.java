package workshop2;

public class Parent {
    private String name;
    protected int age;
    public String address;

    }
    class Child extends Parent{
    Child(String name, int age, String address){
       // this.name = name;
        this.age = age;
        this.address = address;

    }
    public static void main(String[] args){
        Child c = new Child("Kallu", 19, "Kathmandu");
       // System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(c.address);
    }
}
