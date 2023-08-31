package session10.practice;

public class Animal {
    private String breed;
    public Animal (String breed) {
        this.breed = breed;
        System.out.println("Constructor from class Animal");
    }
}

class Dog extends Animal {

    public Dog(String breed) {
        super(breed);
        System.out.println("Constructor from class Dog");
    }
}
