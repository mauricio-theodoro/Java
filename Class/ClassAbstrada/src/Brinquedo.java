public class Brinquedo extends Produto {

    @Override
    public void update() {
        System.out.println("Atualizando brinquedo...");
    }
    @Override
    public void Insert(int id, String name, double price){
        super.Insert(id, name, price);
    }

    @Override
    public void read() {
        super.read();
    }

    @Override
    public void delet() {
        super.delet();
    }
}
