public class CarroCombate extends Carro {
    private final int MAX_ARMAMENTO=100;
    private final int MIN_ARMAMENTO=0;
    private  int qtdeArmamento;
    public CarroCombate(String nome, int blindagem){
        super(nome);
        super.setArmamento(true);
        super.setBlindagem(blindagem);
        this.qtdeArmamento=100;
    }
    public void setQtdeArmamento(int qtdeArmamento){
        this.qtdeArmamento+=qtdeArmamento;
        if (this.qtdeArmamento > MAX_ARMAMENTO){
            this.qtdeArmamento=MAX_ARMAMENTO;
        } else if (this.qtdeArmamento < MIN_ARMAMENTO) {
            this.qtdeArmamento=MIN_ARMAMENTO;
        }else
            System.out.println("Erro!");
    }
    public int getQtdeArmamento(){
        return this.qtdeArmamento;
    }
    public void atirar(){
        if(this.qtdeArmamento > MIN_ARMAMENTO){
            setQtdeArmamento(-1);
        }else
            System.out.println("Sem Munição");
    }
    public void info(){
        super.info();
        System.out.println("Quantidade de munição....: "+this.qtdeArmamento);
    }
}
