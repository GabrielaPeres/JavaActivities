package aula12;

public class Reptil extends Animal {
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    void alimentar() {
        System.out.println("comendo");
    }

    @Override
    void emitirSom() {
        System.out.println("Som de réptil");
    }
    
    
}
