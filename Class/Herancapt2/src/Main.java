import Animais.*;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Laila");
        cachorro.comer();
        cachorro.latir();

        Gato gato = new Gato("Batman");
        gato.miar();

        Dragao dragao = new Dragao("Ritalina");
        dragao.soltarFolgo();
        dragao.voar();

        Pombo pompinha = new Pombo("Pombinha Bomba");
        pompinha.fazerPruh();
        pompinha.enviarCartas();
        pompinha.voar();

    }
}