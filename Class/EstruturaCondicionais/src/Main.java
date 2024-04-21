import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date time = new Date();// obetendo o ano do sistema
        String date = new SimpleDateFormat("yyyy").format(time);
        System.out.println("Entre com a sua data de nascimento:");
        int nascimento = input.nextInt();
        int i = Integer.parseInt(date) - nascimento; // passando date que é string para inteiro
        if (i <16){// usando o primeiro if , depois abrir outra if
            System.out.println("Não vota!");
        }else {
            if ((i>=16 && i<18) || (i>70)){ // a estrutura condicional é um if dentro de outro if
                System.out.println("Voto Opcional!");
            }else
                System.out.println("Voto Obrigatorio!");
        }
        System.out.println("Sua idade é: "+i);
    }
}