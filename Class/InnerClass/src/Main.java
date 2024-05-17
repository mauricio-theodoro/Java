class Outside{
    int a = 0;
    static class Inside{
        int b = 5;
    }
}
public class Main {
    public static void main(String[] args) {
        Outside outside = new Outside();
        Outside.Inside i = new Outside.Inside();
        System.out.println(i.b);
    }
}