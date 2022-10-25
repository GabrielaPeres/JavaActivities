package aula09;
public class Aula09 {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[4];

        p[0] = new Pessoa("Rebecca", 25, "Feminino");
        p[1] = new Pessoa("Raquel", 20, "Feminino");
    

        l[0] = new Livro("RBD", "Vanessa", 300, 40, false, p[1]);
        l[1] = new Livro("Lago dos cisnes", "Iana", 500, 50, false, p[1]);
        l[2] = new Livro("Hanna Montana", "Miley", 300, 50, false, p[0]);
        l[3] = new Livro("Misterios", "Fiona", 500, 30, true, p[0]);
        
       l[0].detalhes();
       l[1].detalhes();
        
        
        
        
        
       }
    
    
   
    
}
 