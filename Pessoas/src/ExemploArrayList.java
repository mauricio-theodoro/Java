import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList {
    public static void main(String[] args) {
        ArrayList<Pessoa> agendaPessoa = new ArrayList<Pessoa>();
        Scanner input = new Scanner(System.in);
        String nome = "";
        String end = "";
        String tel = "";
        int opc = -1;
        do {
            System.out.println("1Cadastrar");
            System.out.println("2Listar");
            System.out.println("0Sair");
            opc = input.nextInt();
            if(opc == 1){
                cadastrar(agendaPessoa);

            } else if (opc == 2) {
                listar(agendaPessoa);
            }else if(opc == 0){
                //sair
            }
        }while(opc !=0);
    }

    private static void listar(ArrayList<Pessoa> agendaPessoa) {
        for (Pessoa obj: agendaPessoa) {
            System.out.println(obj.toString());
        }
    }

    private static void cadastrar(ArrayList<Pessoa> agendaPessoa) {
        Scanner input = new Scanner(System.in);
        String nome = "";
        String tel = "";
        String end = "";
        System.out.println("Digite seu nome");
        nome = input.nextLine();
        System.out.println("Digite seu endereço");
        end = input.nextLine();
        System.out.println("Digite seu telefone");
        tel = input.nextLine();
        Pessoa objPessoa = new Pessoa(nome, end, tel);
        agendaPessoa.add(objPessoa);
    }
}
