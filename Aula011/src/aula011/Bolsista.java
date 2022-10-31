package aula011;
public class Bolsista extends Aluno {
    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
        
    public void renovarBolsa(){
        System.out.println("Renovando bolsa");
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + "é bolsista!Pagamento efetuado"); 
    }
}
