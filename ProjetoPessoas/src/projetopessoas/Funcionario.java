package projetopessoas;

public class Funcionario extends Pessoa{
    private String funcionario;
    private boolean trabalhando;


    public String getFuncionario() {
        return funcionario;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    public void mudarTrabalho(){
        this.trabalhando = !this.trabalhando;
    }
    
    
    
    
    
    
    
    
    
    
}
