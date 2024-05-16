package DAO;

public interface CRUD {
    public abstract void Inserir();
    public abstract void Ler();
    public abstract void Atualizar();
    public abstract void Deletar();
    public void Selecionar();
    public String Imprimir();
}

