import java.io.IOException;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, World!");
        char ch;
        ch = 'X';
        System.out.println("ch contains " + ch);
        ch++; // incremento ch
        System.out.println("ch is now " + ch);
        ch = 90; // da a ch o valor Z
        System.out.println("ch is now " + ch);
        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 922337283784884L;
        boolean tipoBooleano = true;
        System.out.println("Valor do tipoByte = "+ tipoByte);
        System.out.println("Valor do tipoShort = "+ tipoShort);
        System.out.println("Valor do tipoChar = "+ tipoChar);
        System.out.println("Valor do tipoFloat = "+ tipoFloat);
        System.out.println("Valor do tipoDouble = "+ tipoDouble);
        System.out.println("Valor do tipoInt = "+ tipoInt);
        System.out.println("Valor do tipoLong = "+ tipoLong);
        System.out.println("Valor do tipoBooleano = "+ tipoBooleano);
        System.out.println("Exemplo do while");
        int opcao = -1;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("********** Sistema de Cadastro **********");
            System.out.println("Opção 1: Cadastrar Cliente.");
            System.out.println("Opção 2: Cadastrar Produto.");
            System.out.println("Opção 3: Cadastrar Vendedor.");
            System.out.println("Opção 0: Sair.");
            System.out.println("******************************************");
            System.out.println("Digite a opção: ");
            opcao = in.nextInt();
            System.out.println("******************************************");
            switch (opcao){
                case 1:
                    System.out.println("Opção 1 escolhida.");
                    break;
                case 2:
                    System.out.println("Opção 2 escolhida.");
                    break;
                case 3:
                    System.out.println("Opção 3 escolhida.");
                    break;
                case 0:
                    System.out.println("Opção 0 escolhida.");
                    break;
                default:
                    System.out.println("Opção Invalida.");
            }
        }while(opcao !=0);


    }
}
