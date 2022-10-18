
package contabanco;

public class ContaBanco {
public int numConta;
protected String tipo;
private String dono;
private int saldo;
private boolean status;
//métodos 
    public ContaBanco(int saldo,boolean status){
        saldo = 0;   
        status = false;
    }
    public void setNumConta(int n){
        numConta = n;
    }
    public int getNumConta(){
        return numConta;
    }
    public void setTipo(String t){
    tipo = t;
    }
    public String getTipo (){
        return this.tipo;
        }
    
    public void setDono(String d){
        dono = d;
    }
    public String getDono(){
        return this.dono;
    }
    
   public void setSaldo(int s){
    saldo =s;
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
    
    public void abrirConta(String t){
        setTipo = t;
        setStatus = true;
            if(t = "CC"){
             saldo =50;
        }else saldo = 150;
    }
    Public void fecharConta(){
        if (saldo>0){
            status = false;
        }else status = true;
    }
    public void depositar (int v){
        if(status = true){
            saldo = saldo + v;
        }else 
            System.out.println("não pode depositar , é necessário abrir a conta!");
    }
    public void sacar(int v){
    if ( status = true && saldo>0){
    saldo = saldo - v;
    }else 
      System.out.println("Não é possível sacar!");
    
    public void pagarMensal(int v){
      int v;
       if( tipo = "CC"){ 
           v = 12;
       }else
           v =20;
    }
    
    }
    
    
    
    
    
    
    
   
    
    
    
    
    
    
    
}
