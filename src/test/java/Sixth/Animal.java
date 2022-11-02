package Sixth;

public class Animal {

    private boolean vegetarian;
    private String eats;
    private int noOfPaws;

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfPaws() {
        return noOfPaws;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public void setNoOfPaws(int noOfPaws) {
        this.noOfPaws = noOfPaws;
    }

    public Animal(boolean vegetarian, String eats, int noOfPaws) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfPaws = noOfPaws;
    }
    public Animal(){

    }
}
