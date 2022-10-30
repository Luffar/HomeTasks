package Fifth;

public class Dog {
    private String name;
    private int age;
    private String color;
    private int height;

    public Dog(String name, int age, String color, int height) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.height = height;
    }

    public Dog(int age, int height) {
        this.age = age;
        this.height = height;
        name = "John";
        color = "Black";
    }

    public Dog() {
        System.out.println("Creating object of the class Dog.");
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public static void main(String[] args) {

        Fifth.Dog dog = new Fifth.Dog("John", 5, "Black", 1);
        Fifth.Dog dog1 = new Fifth.Dog(8, 2);
        Fifth.Dog dog2 = new Fifth.Dog();

        System.out.println("Current params of the dog:");
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Color: " + dog.getColor());
        System.out.println("Height: " + dog.getHeight());
        System.out.println();

        System.out.println("Params of the dog after 3 years:");
        System.out.println("Name: " + dog1.getName());
        System.out.println("Age: " + dog1.getAge());
        System.out.println("Color: " + dog1.getColor());
        System.out.println("Height: " + dog1.getHeight());
        System.out.println();

        System.out.println(dog2);

    }
}

