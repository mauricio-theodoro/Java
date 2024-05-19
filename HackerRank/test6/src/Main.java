import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Digite um número inteiro para realizar a multiplicação:");
            String n1 = input.readLine();
            int numero = Integer.parseInt(n1);
            for (int i = 1; i <= 10; i++){
                int resultado = numero * i;
                System.out.printf("%d x %d = %d%n", numero, i, resultado);
            }
        }catch(IOException e){
            System.err.println("Número inválido: " + e.getMessage());
        }catch (NumberFormatException e){
            System.err.println("Por favor, digite um número inteiro válido." + e.getMessage());
        }finally {
            try{
                input.close();
            }catch (IOException e){
                System.err.println(e.getMessage());
            }
        }
    }
}