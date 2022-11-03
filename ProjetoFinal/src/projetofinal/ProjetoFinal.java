package projetofinal;

public class ProjetoFinal {

    public static void main(String[] args) {
        Video v1 = new Video("crepusculo", 1, 0, 0, false);
        Gafanhoto g1 = new Gafanhoto("Alana", 22, "Feminino", true);

        Vizualizacao vis = new Vizualizacao(g1, v1);
        vis.avaliar(35.0f);
        System.out.println(vis.toString());
    }
}