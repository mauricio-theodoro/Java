

public class Main {
    public static void main(String[] args) {
        /*Dog d = new Dog();
        d.bark();
        d.poop();
        System.out.println(d.getavgSize()); */

        Chihuahua c = new Chihuahua();
        c.bark();
        c.poop();
        System.out.println(c.getavgSize());

        Dog d = new Chihuahua(); // podemos usar um construtor dessa forma desde que a classe esteja herdando da outra classse (pai)
        d.bark();
        d.poop();


    }
}