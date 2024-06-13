public class Garagem extends Condominio {
    private int id;
    private int Ngaragem;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNgaragem() {
        return Ngaragem;
    }

    public void setNgaragem(int ngaragem) {
        Ngaragem = ngaragem;
    }
    public void Imprimir(){
        System.out.println("ID: "+ getId()+"\n"+"Numero Garagem: "+ getNgaragem()+ "\n"+"Numero do Apartamento: "
        +getNapartamento());

    }

}
