import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        String path = "C:\\Users\\DELL\\IdeaProjects\\ReadaCSVFileintoanArray\\doc\\SacramentocrimeJanuary2006.CSV";
        String line = "";

        try{ // é necessario fazer o try cath para usar o buffered,
            BufferedReader br = new BufferedReader(new FileReader(path)); // ler arquivos em formato texto. é necessario colocar a variavel
            while((line = br.readLine()) != null){ // laço de repetição para percorre a lista. "!=null" serve para perccore o codigo e sair do laço de repertição
                String [] values = line.split(","); // Split é usado para dividir uma string em pequenos pedaços
                System.out.println("Date: "+ values[0]+", Crime description: "+ values[5]);
                // System.out.println(values[1]); // array de values , pode-se selecionar diferentes informações do arquivo de leitura

                //System.out.println(line);
                //break;
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}