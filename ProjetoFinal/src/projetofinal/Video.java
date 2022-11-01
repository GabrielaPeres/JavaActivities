package projetofinal;

public class Video implements AcoesVideo {

    private String titulo;
    private int avalicao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo, int avalicao, int views, int curtidas, boolean reproduzindo) {
        this.titulo = titulo;
        this.avalicao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAvalicao() {
        return avalicao;
    }

    public int getViews() {
        return views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }
 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAvalicao(int avalicao) {
        this.avalicao = avalicao;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
    this.reproduzindo = true;
    }

    @Override
    public void pause() {
    this.reproduzindo = false;
    }

    @Override
    public void like() {
    this.curtidas ++;
    }
}
