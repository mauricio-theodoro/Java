package Classses_Filhas;

import Classes_Pai.Animal;

public class Cao extends Animal{
    private float hora;
    private boolean EMcasa = false;
    public void Atividade(float hora){
        this.hora = hora;
        if (this.hora >= 6 && this.hora <= 7){
            System.out.println("Hora de comer");
        }else
            System.out.println("Brincando");
    }
    public void Atividade(float hora, boolean EMcasa) {
        this.hora = hora;
        this.EMcasa = EMcasa;
        if (this.EMcasa == true) {
            if (this.hora > 22) {
                System.out.println("Dormindo");
            } else
                System.out.println("Brincando");
        } else
            System.out.println("Rotina alterada");
    }

    @Override
    public void locomover() {
        System.out.println("andando...");
    }

    @Override
    public void comida() {

    }

    @Override
    public void som() {

    }
}
