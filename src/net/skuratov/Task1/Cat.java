public class Cat {

    private String name;
    private String colour;
    private int age;
    private double weight;

    public Cat(String name, String colour, int age, double weight) {
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.weight = weight;
    }

    void meow() {
        System.out.println("Мяу");
    }

    void murr() {
        System.out.println("Мррррр");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
