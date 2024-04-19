package Animais;

public class Pombo extends Ave {
    private int cartasEnviadas;
    public Pombo(String nome){
        super(nome);
        cartasEnviadas = 10;
    }
    public void fazerPruh(){
        System.out.printf("%s Fez Pruh,Pruh\n", getNome());
    }
    public void enviarCartas(){
        System.out.printf("%s Entregou uma carta\n", getNome());
        this.cartasEnviadas ++;
    }
    public int getCartasEnviadas(){
        return cartasEnviadas;
    }
}
