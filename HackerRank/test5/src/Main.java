import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        // Arrays para armazenar as strings e os números
        String[] n1 = new String[3];
        int[] n2 = new int[3];
        try{
            System.out.println("Digite uma string depois um número inteiro:");
            for (int i = 0; i < 3; i++){
                String aux = input.readLine();
                String[] separador = aux.split(" ");

                // Verifica se a entrada é válida
                if(separador.length < 2){
                    System.out.println("Entrada inválida: Digite uma string depois um número inteiro:");
                    i--; // Decrementa o índice para repetir a iteração atual
                    continue;
                }
                n1[i] = separador[0];
                n2[i] = Integer.parseInt(separador[1]);
            }
            for (int i = 0; i < 3; i++){
                System.out.printf("%-15s%03d%n", n1[i], n2[i]); // %-15s: a string deve ser justificada à esquerda em um campo de largura 15
                // %03d: o número deve ser exibido com 3 dígitos, preenchido com zeros à esquerda
            }
        }catch (IOException e){
            System.err.println("Digite um numero valido:" + e.getMessage());
        }finally {
            //fechando o teclado buffered
            try {
                input.close();
            }catch (IOException e){
                System.err.println(e.getMessage());
            }
        }
    }
}