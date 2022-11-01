package aula12;

public class Mamifero extends Animal {
    private String corPelo;

    @Override
    void locomover() {
        System.out.println("correndo");
    }

    @Override
    void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    void emitirSom() {
        System.out.println("Som de mamífero");
    }
}
