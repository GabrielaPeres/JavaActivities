package aula12;

public class Aula12 {

    public static void main(String[] args) {
        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave a1 = new Ave();

        System.out.println("-------------------------");
        m1.alimentar();
        m1.locomover();
        m1.emitirSom();
        System.out.println("-------------------------");
        r1.alimentar();
        r1.locomover();
        r1.emitirSom();
        System.out.println("--------------------------");
        p1.alimentar();
        p1.locomover();
        p1.emitirSom();
        p1.soltarVolha();
        System.out.println("---------------------------");
        a1.alimentar();
        a1.locomover();
        a1.emitirSom();
        a1.fazerNinho();

    }

}
