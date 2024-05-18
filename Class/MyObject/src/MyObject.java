//passaro
interface Bird {
    public void sing();
}
class Eagle implements Bird {
    public void sing(){
        System.out.println("Singin!");
    }
}
public class MyObject {
        public static void main(String[] args) {
            Eagle e = new Eagle();
            System.out.println(e instanceof Bird);
            // CLASSE, SUB CLASSE OR INTERFACE
        }
}