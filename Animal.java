package workshop2;

public class Animal {
        String name;
        int age;
        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String toString() {
        return name + " " + age + " " + breed;
    }

        public static void main(String[] args) {
            Dog D = new Dog("Kalu", 3, "Chupakabra");
            System.out.println(D);
        }
    }

