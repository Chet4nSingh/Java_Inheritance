package Inheritance;

public class Dog extends Animal {
    private String earType;
    private String color;
    
    public Dog() {
        super("Mutt", "Big", 400);
    }

    public Dog(String type, String size, int weight, String earType, String color) {
        super(type, size, weight);
        this.earType = earType;
        this.color = color;
    }

    // public String toString() {
    //     return "Dog {" + "ear"}"
    // }
}
