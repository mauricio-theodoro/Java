import jogo.Arqueiro;
import jogo.Personagem;

public class App {
    public static void main(String[] args) {

        Arqueiro arqueiro = new Arqueiro("Joao");
        System.out.println(arqueiro);
        arqueiro.atacar();
        arqueiro.atacarSemArma();
        arqueiro.atacarComArma();

    }
}
