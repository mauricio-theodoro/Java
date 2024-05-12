import java.util.HashMap;

/* ArrayList
é um conjunto de elementos de um tipo definido. É uma estrutura ordenada de dados, ou seja, os valores podem ser acessados por seus índices.

Exemplo:

ArrayList<string> lista = new ArrayList<>();
lista.add("Stack");
lista.add("Overflow");
Isso seria algo como

Index | Elemento
  0   | "Stack"
  1   | "Overflow"
Estes elementos podem ser acessados pelo seu índice

String str1 = lista.get(0); //str1 receberá "Stack"
HashMap
É um conjunto de pares de chave-valor, para cada elemento (valor) salvo num HashMap deve existir uma chave única atrelada a ele. Os elementos num HashMap devem ser acessados por suas chaves.

Exemplo:

HashMap<Integer, String> hashMap = new HashMap<>();
hashMap.put(1, "Stack");
hashMap.put(5, "Overflow");
Isso seria algo como:

Key | Value
 1  | "Stack"
 5  | "Overflow"
Estes elementos podem ser acessados pela chave

String str = map.get(5);//str receberá "Overflow" */
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> fun = new HashMap<String, String>();
        fun.put("bobby1994", "FluffyPonies!");
        fun.put("helloToMom", "AloVera?");
        fun.put("helloToMom2", "AloVera?3");
        fun.put("goodmoney", "password123");
        System.out.println(fun.replace("bobby1994","b3tt3rP@ssword!"));
        fun.remove("helloToMom2");
        System.out.println(fun);
        System.out.println(fun.containsValue("password123"));
        System.out.println(fun.size());
    }
}