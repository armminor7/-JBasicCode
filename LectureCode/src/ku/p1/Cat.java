package ku.p1;

public class Cat {

    private int age;
    private String color;
    private String sex;
    private double weight;

    public Cat(int age, String color, String sex, double weight) {

        this.age = age;
        this.color = color;
        this.sex = sex;
        this.weight = weight;
    }

    void purring() {
        System.out.println("Purr!");}

    void eating() {
        System.out.println("The cat is eating");}

    void sleeping() {
        System.out.println("The cat is sleeping");}

    void meowing() {
        System.out.println("meow");}

}
