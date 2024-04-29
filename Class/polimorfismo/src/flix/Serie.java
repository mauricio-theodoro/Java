package flix;

import com.sun.security.jgss.GSSUtil;

public class Serie extends Filme{
    private int Temporadas;
    private int episodioPorTemporada;
    private int temporadaAtual;
    private int episodioAtual;

    public Serie(String nome, int temporadas, int episodioPorTemporada) {
        super(nome);
        Temporadas = temporadas;
        this.episodioPorTemporada = episodioPorTemporada;
        this.temporadaAtual = 1;
        this.episodioAtual = 1;
    }

    public void play(int temporada, int episodio) {
        if (validarEpisodio(temporada, episodio)){
            this.temporadaAtual = temporada;
            this.episodioAtual = episodio;
            System.out.println("Play: "+ toString());
        }else
            System.out.println("Episodio inválido!");
    }
    private boolean validarEpisodio(int temporada, int episodio){
        if (temporada == 0 || episodio == 0){
            return false;
        } else if (temporada > Temporadas || episodio > episodioPorTemporada ) {
            return false;
        }else
            return true;
    }

    // add os metodos especificos da classes
    @Override
    public String toString() {
        String informacao = String.format("Serie %s %dx%02d (audio %s, legenda %s)", getNome(),temporadaAtual,episodioAtual, getAudio(),getLegenda());
        return informacao;
    }

    // os metodos getters and setters
    public int getTemporadas() {
        return Temporadas;
    }

    public void setTemporadas(int temporadas) {
        Temporadas = temporadas;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getTemporadaAtual() {
        return temporadaAtual;
    }

    public void setTemporadaAtual(int temporadaAtual) {
        this.temporadaAtual = temporadaAtual;
    }

    public int getEpisodioAtual() {
        return episodioAtual;
    }

    public void setEpisodioAtual(int episodioAtual) {
        this.episodioAtual = episodioAtual;
    }
}
