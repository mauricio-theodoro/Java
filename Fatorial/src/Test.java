import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        boolean
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(2);
        array.add(8);
        array.add(99);
        int resultado = elementoPresente(array, 99, array.size() - 1);
        System.out.println("Resultado: "+ resultado);
    }
    private static int elementoPresente(ArrayList<Integer> array, int elemento, int tamanho){
        if(tamanho < 0){
            return 0;
        }
        if(array.get(tamanho) == elemento){
            return 1;
        }
        return elementoPresente(array, elemento, tamanho - 1);
    }
}
