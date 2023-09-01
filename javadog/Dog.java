public class Dog {
    private String name;
    private int age;
    private String color;
    private String breed;


    public Dog(String name, int age, String color, String breed){
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " barks!");
    }

    public void run() {
        System.out.println(name + " runs");
    }

    public void sit(){
        System.out.println(name + " sits");
    }

    public void sleep(){
        System.out.println(name + " sleeps");

    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public static void main(String[] args) {
        Dog myDog  = new Dog("Violet", 5, "Black",  "Caviler");
        Dog myDog2 = new Dog("Grey", 2, "Grey", "Caviler");
        Dog myDog3 = new Dog("Moose", 3, "Grey", "Caviler");
        myDog.bark();
        myDog.run();
        myDog.sit();
        myDog.sleep();

        System.out.println("Name: " + myDog.getName());
        System.out.println("age: " + myDog.getAge());
        System.out.println("The color is: " + myDog.getColor());
        System.out.println("The breed is: " + myDog.getBreed());

        System.out.println("Name: " + myDog2.getName());
        System.out.println("age: " + myDog2.getAge());
        System.out.println("The color is: " + myDog2.getColor());
        System.out.println("The breed is: " + myDog2.getBreed());

        System.out.println("Name: " + myDog3.getName());
        System.out.println("age: " + myDog3.getAge());
        System.out.println("The color is: " + myDog3.getColor());
        System.out.println("The breed is: " + myDog3.getBreed());
    }
}

