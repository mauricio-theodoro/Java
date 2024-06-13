public class Portaria {
    private int id;
    private String placa;
    private String Nvisitante;
    private String porteiro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNvisitante() {
        return Nvisitante;
    }

    public void setNvisitante(String nvisitante) {
        Nvisitante = nvisitante;
    }

    public String getPorteiro() {
        return porteiro;
    }

    public void setPorteiro(String porteiro) {
        this.porteiro = porteiro;
    }
    public void Imprimir(){
        System.out.println("ID: "+ getId()+"\n"+"Placa do carro: "+ getPlaca()+"\n"+"Visitante: "+getNvisitante()+"\n"+"Porteiro: "+getPorteiro());

    }
}
