public class Pagamentos extends Condominio {
    private int id;
    private double ValorCond;
    private double TaxaExtra;
    private double multa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorCond() {
        return ValorCond;
    }

    public void setValorCond(double valorCond) {
        ValorCond = valorCond;
    }

    public double getTaxaExtra() {
        return TaxaExtra;
    }

    public void setTaxaExtra(double taxaExtra) {
        TaxaExtra = taxaExtra;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public void Imprimir(){
        System.out.println("ID: "+ getId()+"\n"+"Valor do Condominio: "+ getValorCond()+"\n"+"Taxa Extra: "+getTaxaExtra()+"\n"+"Multa: "+getMulta()
                +"\n"+"Apartamento: "+getNapartamento());

    }
}
