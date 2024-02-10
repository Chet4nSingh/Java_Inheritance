package Inheritance;

public class Animal {
    private String type;
    private String size;
    private int weight;

    public Animal(String type, String size, int weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public String toString() {
        return "Animal {" + "\n\tType = " + type + "\n\tSize = " + size + "\n\tWeight = " + weight + "\n}";
    }

    public void move (String speed) {
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise() {
        System.out.println(type + " makes some kind of noise");
    }
    
}