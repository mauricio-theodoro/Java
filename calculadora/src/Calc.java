import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Number n1 = new Number();
        Number n2 = new Number();
        Number res = new Number();

        String loop ="S";

        while (loop.equals("s" )|| loop.equals("S")){
            System.out.println("Digite o primeiro valor:");
            n1.setVal(input.nextInt());
            System.out.println("Digite o segundo valor:");
            n2.setVal(input.nextInt());
            res.setVal(n1.getVal() + n2.getVal());
            System.out.println("Resultado da soma: "+ res.getVal());
            System.out.println("Deseja somar outro valor? S - N");
            loop = input.next();
        }
    }

}
