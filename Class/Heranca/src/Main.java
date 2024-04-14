public class Main {
    public static void main(String[] args) {

        Carro uno1 =  new Carro("Uno");
        Carro palio = new Carro("Palio");
        CarroCombate uno2 = new CarroCombate("Unin com escada", 100);
        CarroCombate palio2 = new CarroCombate("Palin 2 portas", 50);

        uno2.atirar();
        uno2.atirar();
        uno2.atirar();
        palio2.sofrerDano(30);
        palio.sofrerDano(5);


        uno1.info();
        uno2.info();
        palio.info();
        palio2.info();
    }
}
