import Class.Monkey;
import java.util.Scanner;

import static Class.Monkey.sayOohAhhAhh;

public class Main {
    public static void main(String[] args) {
        String name;
        String type;

        Monkey m1 = new Monkey();
        Monkey m2 = new Monkey();

        System.out.println("Entre com os nome dos 2 macaquinhos: ");
        Scanner input = new Scanner(System.in);
        Monkey [] monkeys = {m1,m2};
        name = input.nextLine();
        m1.setName(name);
        name = input.nextLine();
        m2.setName(name);
        System.out.println("Agora entre com a raça dos 2 macaquinhos:");
        type = input.nextLine();
        m1.setType(type);
        type = input.nextLine();
        m2.setType(type);
        System.out.println(m1.getName() + m2.getName());
        System.out.println(m1.getType() + m2.getType());

        for(Monkey m : monkeys){
            sayOohAhhAhh();
        }
    }
}