import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Entre com a primeira letra do seu nome e o dia que nasceu");
        Scanner input = new Scanner(System.in);
        String letter = input.next().toUpperCase();
        int day = input.nextInt();
        HashMap<String, String> letters = new HashMap<String, String>();
            letters.put("A", "Wretched");
        letters.put("B", "DEEPLY");
        letters.put("C", "PhEnOmEnAl");
        letters.put("D", "groolY");
        letters.put("E", "MoNUMEntal");
        letters.put("F", "EXPLOSIVE!");
        letters.put("G", "uNEXPECTEDLY");
        letters.put("H", "BiG");
        letters.put("I", "SaGGy");
        letters.put("J", "TrouBLEsome");
        letters.put("K", "GIGANTIC");
        letters.put("L", "TREMENDOUS");
        letters.put("M", "DENGEROUSLY");
        letters.put("N", "crazy");
        letters.put("O", "SCRAWNY");
        letters.put("P", "LONG3");
        letters.put("Q", "Value");
        letters.put("R", "Value");
        letters.put("S", "Value");
        letters.put("T", "MODERALELY");
        letters.put("U", "HAPPY");
        letters.put("V", "TROUBLESOME");
        letters.put("W", "SAGGY");
        letters.put("X", "HEARTY");
        letters.put("Y", "Test");
        letters.put("Z", "Luxurious");

        HashMap<Integer, String> days =  new HashMap<Integer, String>();
        days.put(1,"SOUR");
        days.put(2, "GREAT");
        days.put(3, "OLD");
        days.put(4, "LOUD");
        days.put(5, "LETTLE");
        days.put(6, "EPIC");
        days.put(7, "WET");
        days.put(8, "DANK");
        days.put(9, "FAKE");
        days.put(10, "SENILE");
        days.put(11, "MUSTY");
        days.put(12, "SHARP");
        days.put(13, "DANGEROUS");
        days.put(14, "MONOTONE");
        days.put(15, "SQUEAKY");
        days.put(16, "NOISELESS");
        days.put(17, "SQUEAKY");
        days.put(18, "NOISELESS");
        days.put(19, "ROTTEN");
        days.put(20, "FAT");
        days.put(21, "SOFT");
        days.put(22, "POTENT");
        days.put(23, "SUDDEN");
        days.put(24, "POWERFUL");
        days.put(25, "FLAT");
        days.put(26, "FULL");
        days.put(27, "WINDY");
        days.put(28, "HORRID");
        days.put(29, "BEAUTIFUL");
        days.put(30, "HOT");
        days.put(31, "SILENT");

        System.out.println("You are a "+ letters.get(letter)+ " "
        + days.get(day)+ " FART");



    }
}