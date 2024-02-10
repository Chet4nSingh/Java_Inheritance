package Inheritance;

public class Animal {
    private String type;
    private String size;
    private String weight;

    public String toString() {
        return "Animal {" + "Type = " + type + "\nSize = " + size + "\nWeight = " + weight + "}";
    }

    public void move (String speed) {
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise() {
        System.out.println(type + " makes some kind of noise");
    }
    
}