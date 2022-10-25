package projetopessoas;

public class Professor extends Pessoa {

    private String especialidade;
    private int salario;

     public String getEspecialidade() {
        return especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void receberAumento(int aumento) {
        this.salario = this.salario + aumento;
    }

}
