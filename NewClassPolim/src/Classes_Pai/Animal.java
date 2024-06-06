package Classes_Pai;

public abstract class Animal {
    private int idade;
    private  float peso;
    private String corpo;
    public abstract  void locomover ();
    public abstract void comida();
    public abstract void som();
    public void imprimir(){
        System.out.println("Nome do animal ");
    }
}
