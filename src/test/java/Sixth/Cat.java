package Sixth;

public class Cat extends Animal {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat(boolean vegetarian, String eats, int noOfPaws, String color) {
        super(vegetarian, eats, noOfPaws);
        this.color = color;
    }

    public Cat(boolean vegetarian, String eats, int noOfPaws) {
        super(vegetarian, eats, noOfPaws);
        color = "ginger";
    }
}
