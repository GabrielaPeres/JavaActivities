package aula13;

public class Aula13 {

    public static void main(String[] args) {
        Mamifero m1 = new Mamifero();
        Lobo l1 = new Lobo();
        Cachorro c1 = new Cachorro();

        m1.emitirSom();
        m1.setCorPelo("preto");
        m1.setIdade(10);
        m1.setMembros(4);
        m1.setPeso(40f);
        System.out.println("------------------------");
        l1.emitirSom();
        l1.setCorPelo("cinza");
        l1.setIdade(3);
        l1.setMembros(4);
        l1.setPeso(20f);
        System.out.println("------------------------");
        c1.emitirSom();
        c1.setCorPelo("branco");
        c1.setIdade(12);
        c1.setMembros(4);
        c1.setPeso(10f);

    }

}
