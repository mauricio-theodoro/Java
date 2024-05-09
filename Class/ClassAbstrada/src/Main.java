

public class Main {
    public static void main(String[] args) {
        Brinquedo brinquedo = new Brinquedo();
        brinquedo.Insert(1, " Boneco ", 15.98);
        brinquedo.delet();
        brinquedo.update();
        brinquedo.read();
        Bolas b = new Bolas();
        b.update();
        b.delet();
        b.Insert(1, " Capotan ", 40.50);
        b.read();
    }
}