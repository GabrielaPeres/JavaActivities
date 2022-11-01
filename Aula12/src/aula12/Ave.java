package aula12;

public class Ave extends Animal {

    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public void fazerNinho() {
        System.out.println("Fazendo ninho");
    }

    @Override
    void locomover() {
        System.out.println("Voando");
    }

    @Override
    void alimentar() {
        System.out.println("Comendo");
    }

    @Override
    void emitirSom() {
        System.out.println("Piando");
    }
}
