import flix.Filme;
import flix.Serie;
import flix.Video;

public class Main{
    public static void main(String[] args) throws Exception {
        //plimorfismo
        // permite que o mesmo nome, represente vários comportamentos diferentes
        // um unico nome pode ter comportamento diferentes
        Filme filme = new Filme("O Demolidor");
        filme.play();
        filme.play("japonês"); // você tem um unico metodo play que possuo diferentes comportamentos.
        filme.play("inglês", "japonês");

        Serie serie = new Serie("Game Of Thrones", 3,13);
        serie.play(3,5);
        System.out.println(serie);
    }
}