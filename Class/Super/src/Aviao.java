public class Aviao extends Veiculo{
    private int categoria;

    public Aviao(String nome, int categoria){
        super(nome, 10); // chama o costrutor da super classe
        this.categoria=categoria;
    }
    public void info(){
        super.info();// chamando o metodo da super classe para ser impresso no contrutor!
        System.out.println("Categoria: "+this.categoria);
    }
}
