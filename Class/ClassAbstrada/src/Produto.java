import javax.swing.plaf.synth.SynthOptionPaneUI;

public abstract class Produto {
    private int id;
    private String name;
    private double price;

    public void Insert(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
        System.out.println(this.id + this.name + this.price);
    }
    public void read(){
        System.out.println("Lendo o produto...");

    }
    public void delet(){
        System.out.println("Deletando o produto...");
    }
    public abstract void update();
}
