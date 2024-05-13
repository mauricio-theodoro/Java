/*O HashSet é uma implementação de um Set e ele é responsável por armazenar valores
em uma lista e não permitir valores duplicados, então se você quiser adicionar dois
valores iguais, o HashSet irá guardar apenas um desses valores.*/

import java.util.HashSet;
import java.util.Iterator;

public class Main{
    public static void main(String[] args) {
    /*    HashSet<String> a = new HashSet<String>();
        a.add("ultraleve");
        a.add("Spider money");
        a.add("javali");
        a.add("silver");
        System.out.println(a);
        a.remove("javali");
        System.out.println(a);
        System.out.println(a.size());
        System.out.println(a.contains("javali"));
        a.clear();
        System.out.println(a);
        System.out.println(a.isEmpty());
*/
        HashSet<Integer> hash = new HashSet<Integer>();
        hash.add(13);
        hash.add(3);
        hash.add(2);
        hash.add(5);
        hash.add(10);

        System.out.println(hash.hashCode());

        Iterator<Integer> it = hash.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }

}