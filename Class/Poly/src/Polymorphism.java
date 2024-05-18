class Bird {
    public void sing(){
        System.out.println("Tweet tweet tweet");
    }
}
class Robin extends Bird{
    public void sing(){
        System.out.println("twiddledeedee");
    }
}
class Pellican extends Bird{
    public void sing(){
        System.out.println("KWAAH KHAAH KHAAH");
    }

}
public class Polymorphism{
    public static void main(String[] args) {
        Pellican b = new Pellican();
        b.sing();
    }
}
// this is polymorphism, same method for different action