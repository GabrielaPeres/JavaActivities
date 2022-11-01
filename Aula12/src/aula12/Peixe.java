package aula12;

public class Peixe extends Animal {
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public void soltarVolha() {
        System.out.println("Soltando bolha");
    }

    @Override
    void locomover() {
        System.out.println("Nadando");
    }

    @Override
    void alimentar() {
        System.out.println("Comendo alga");
    }

    @Override
    void emitirSom() {
        System.out.println("Blue Blue");
    }
}
