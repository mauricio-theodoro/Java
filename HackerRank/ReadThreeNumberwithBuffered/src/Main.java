import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Insira 3 numeros inteiros: ");
            String Num = reader.readLine();
            int Num1 = Integer.parseInt(Num);
            Num = reader.readLine();
            int Num2 = Integer.parseInt(Num);
            Num = reader.readLine();
            int Num3 = Integer.parseInt(Num);

            System.out.println(Num1);
            System.out.println(Num2);
            System.out.println(Num3);
        }catch(IOException e){
            System.err.println("Erro ao ler entrada: "+ e.getMessage());
        }catch (NumberFormatException e){
            System.err.println("Insira um número válido! "+ e.getMessage());
        }
    }
}