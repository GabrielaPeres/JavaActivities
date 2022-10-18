 package aula05;

public class Aula05 {
    
    public static void main(String[] args) {
       ContaBanco p1 = new ContaBanco();
       p1.setNumConta(1);
       p1.setTipo("CC");
       p1.setDono("Jubileu");
       p1.setSaldo(300);
       p1.setStatus(true);
       p1.estadoAtual();
        System.out.println("---------------------------------------");
     ContaBanco p2 = new ContaBanco();
       p2.setNumConta(2);
       p2.setTipo("CP");
       p2.setDono("Creuza");
       p2.setSaldo(500);
       p2.setStatus(true);
       p2.estadoAtual();
    }
     
}
