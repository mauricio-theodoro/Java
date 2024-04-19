package Animais;

public class Dragao extends Ave {
    public Dragao(String nome){
        super(nome);
    }
    public void soltarFolgo(){
        System.out.printf("%s soltou uma bola de fogo\n", getNome());
    }
}
