import java.sql.SQLOutput;

enum Level{
    LOW, MEDIUM, HIGH; // É NECESSARIO USAR EM UM FORMATO LABEL COMO NESSE EXEMPLO, SEM: ""
}

// enum pode ser criado dentro da classe ou fora dela.
// usamos enum para as coisas que não podem mudar
public class Main {
    public static void main(String[] args) {
        /*System.out.println(Level.LOW);
        System.out.println(Level.MEDIUM);
        System.out.println(Level.HIGH);
        */
        Level l = Level.LOW;
        Level m = Level.MEDIUM;
        Level h = Level.HIGH;
        System.out.println(l);
        switch (l){
            case LOW:
                System.out.println("Low level!");
                break;
        }



    }
}