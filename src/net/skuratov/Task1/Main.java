public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Murchik", "red", 4, 4.5 );
        Cat cat2 = new Cat("Begemot", "black", 5, 5.5 );

        cat1.meow();
        cat1.murr();
        cat2.meow();

        System.out.println(cat1);
        System.out.println(cat2);

    }
}
