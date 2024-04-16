package montyhall;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem-vindo ao jogo Monty Hall!");
        System.out.println("Escolha uma porta (1 - 2 - 3):");
        int chooseDoor = input.nextInt();
        Random random = new Random();
        int prizeDoor = -1;
        //validar a entrada do usuario
        if(chooseDoor > 0 && chooseDoor < 4){
            prizeDoor = random.nextInt(4);
            //Definir a porta escolhida
        }else
            System.out.println("Porta inválida!");
        int emptyDoor = -1;
        do{
            emptyDoor = random.nextInt(3) + 1;
        }while (emptyDoor == prizeDoor || emptyDoor == chooseDoor);
        System.out.println("O apresentador abriu a porta "+ emptyDoor +", que está vazia.");

        //Oferencendo a opção de troca de porta
        System.out.println("Você deseja trocar de porta? (s/n):");
        String opcao = input.next();
        boolean changeDoor = opcao.equalsIgnoreCase("s");
        //Determinando a nova porta escolhida (caso o usuario opte por trocar)
        int originalChooseDoor = chooseDoor;
        if (changeDoor){
            do{
                chooseDoor = random.nextInt(3) + 1;
            }while (chooseDoor == emptyDoor || chooseDoor == originalChooseDoor);
            System.out.println("Você trocou para a a porta "+ chooseDoor+".");
        }
        //Determina o resultado final
        if (chooseDoor == prizeDoor){
            System.out.println("Parabéns, você ganhou!");
        }else
            System.out.println("Que pena, você perdeu. A porta premiada era "+ prizeDoor +".");
        //resultado final.
        System.out.println("Porta premida: "+ prizeDoor);
        System.out.println("Porta vazia: "+ emptyDoor);
        System.out.println("Porta orginal: "+ chooseDoor);
        System.out.println("Porta escolhida: "+ changeDoor);
    }
}