import java.util.Random;

// sobrecarga de metodos
// o java já entende dentro das ( a + b ) se ele é double ou int e atribuir os valores em um dos result criados?
//
public class MyClass {
    public static void main(String[] args) {
        int result = addNumbers(3, 2);
        double result2 = addNumbers(4.60, 23.45);
        int result3 = addNumbers(8,43,997);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        MyClass m = new MyClass();// um jeito de adicionar um codigo da classe quando não houve static chame a classe Main e crie uma declaração
        m.addNumbers(); // chamando o random para conseguir diferentes valores entre 2 numeros de 0 a 10?

    }
    public static int addNumbers(int a, int b){
        return  a + b;
    }
    public static double addNumbers(double a, double b){
        return a + b;
    }
    public static int addNumbers(int a, int b, int c){
        return a + b + c;
    }
    public void addNumbers(){
        Random r = new Random();
        System.out.println(r.nextInt(6)  + r.nextInt(6)); // gerando numeros aleatorios e somando eles
    }
}