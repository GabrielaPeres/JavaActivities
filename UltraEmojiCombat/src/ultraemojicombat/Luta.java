
package ultraemojicombat;

import java.util.Random;

public class Luta {
private Lutador desafiado;
private Lutador desafiante;
private int rounds;
private boolean aprovada;

/* Método Construtor:
    public Luta(Lutador desafiado, Lutador desafiante, int rounds, boolean aprovada) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.rounds = rounds;
        this.aprovada = aprovada;
    }
*/
//Método especiais:
    public Lutador getDesafiado() {
        return desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1,Lutador l2){
    if (l1.getCategoria().equals( l2.getCategoria()) && l1!=l2 ){
        this.setAprovada(true);
        this.desafiado = l1;
        this.desafiante = l2;
    }else{
        this.setAprovada(false);
        this.desafiado = null;
        this.desafiante = null;
        }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("-------------------------");
            System.out.println("Desafiado");
            this.desafiado.apresentar();
            System.out.println("-------------------------");
            System.out.println("Desafiante");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0:
                    System.out.println("Empatou");
                    this.desafiado.empatar();
                    this.desafiante.empatar(); 
                    break;
                case 1:
                    System.out.println("Vitória do" + this.desafiado);
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitória do" + this.desafiante);
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
                    
            }        
        }
            
            
            
        else{
            System.out.println("Luta não aprovada"); 
        }
    }
    
    
    
    
     
}
 