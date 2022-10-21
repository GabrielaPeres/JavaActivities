
package aula09;

public class Livro implements Publicacao {
  private String titulo;
  private String autor;
  private int totPaginas;
  private int pagAtual;
  private boolean aberto;
  private Pessoa leitor;  

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public boolean isAberto() {
        return aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
   public void detalhes(){
       System.out.println("");
       System.out.println("");
       System.out.println("");
   }

    @Override
    public void abrir() {
       this.setAberto(true);
        System.out.println("Livro fechado");
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        System.out.println("Livro aberto");
    }

    @Override
    public void folhear() {
       if (this.aberto){
           System.out.println("Foleando");
       }else
            System.out.println("Não pode folhear pois o livro está fechado");
    }

    @Override
    public void avancarPag() {
        if(this.aberto){
           this.pagAtual++;
        }else
            System.out.println("Não pode avançar página");
        
    }

    @Override
    public void voltarPag() {
       if(this.aberto){
           this.pagAtual--;
        }else
            System.out.println("Não pode voltar a página");
    }
  
  
}
