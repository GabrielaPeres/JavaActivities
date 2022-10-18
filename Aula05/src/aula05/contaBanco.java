
package aula05;

public class ContaBanco {
//Atributos
public int numConta;
protected String tipo;
private String dono;
private int saldo;
private boolean status;
// Métodos 
    public void estadoAtual(){
        System.out.println("Conta:" + this.getNumConta());
        System.out.println("Tipo:" + this.getTipo());
        System.out.println("Dono:" + this.getDono());
        System.out.println("Saldo:" + this.getSaldo());
        System.out.println("Status:" + this.getStatus());  
    }
// Método construtor
    public void contaBanco(int saldo,boolean status){
        this.setSaldo(0);   
        this.setStatus(false);
    }
    // Métodos especiais
    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(){
        return numConta;
    }
    
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo (){
        return this.tipo;
    }
    
    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return this.dono;
    }
    
   public void setSaldo(int s){
        this.saldo = s;
    }
    public int getSaldo(){
        return this.saldo;
    }
    public void setStatus(boolean st){
        status = st;
    }
    public boolean getStatus(){
        return this.status;
    }
    // Métodos personalizados
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC"){
             this.setSaldo (50);
        }else{ 
             this.setSaldo (150);
        }
    }
    public void fecharConta(){
        if (this.getSaldo()>0){
            setStatus(true);
        }else if (this.getSaldo()<0){
            setStatus(true);
        }else{
            this.setStatus(false);   
            }}
    public void depositar (int v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo ()+ v);
        }else{
            System.out.println("não pode depositar , é necessário abrir a conta!");
        }
    }
    public void sacar(int v){
        if ( this.getStatus() && this.getSaldo()>=0){
        this.setSaldo(this.getSaldo()- v);
        }else{
          System.out.println("Não é possível sacar!");
    }
    }
    public void pagarMensal(){
      int v = 0;
       if( this.getTipo() == "CC"){ 
           v = 12;
       }else if (this.getTipo()== "CP"){
           v = 20;
    }
      if (this.getStatus()){
        this.setSaldo( this.getSaldo()- v);
      }else{
        System.out.println("Não é possível pagar mensalidade!");
      }
    }
    
    
}
    
    
    
    
    
    
    
   
    
    
    
    
    
    
    
  
