package flix;

public class Filme extends Video {
    private String audio;
    private String legenda;


    public Filme(String nome) {
        super(nome);
        this.audio = "Português";
        this.legenda = "Nenhuma";
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Play: Filme "+getNome());
    }
    public void play(String audio){ // criando outras sobrecargas
        this.audio = audio;
        System.out.println("Play: "+toString());// pega o formart de to String e formata aqui
        if(audio == "portugues"){
            this.legenda ="nenhum";
        }else
            this.legenda = "português";
        System.out.println("Play: "+ toString());
    }
    public void play(String audio, String legenda){
        this.audio = audio;
        this.legenda = legenda;
        System.out.println("Play: "+toString());
    }

    public String toString(){
        String informacao = String.format("Filme %s (audio %s, legenda %s)", getNome(), audio,legenda);
        return informacao;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }
}
