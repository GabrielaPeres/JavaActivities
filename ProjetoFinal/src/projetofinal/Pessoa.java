package projetofinal;

public abstract class Pessoa {

    protected String nome;
    protected int idade;
    protected String sexo;
    protected boolean experiencia;

    public Pessoa(String nome, int idade, String sexo, boolean experiencia) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = experiencia;
    }

    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public boolean getExperiencia() {
        return experiencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setExperiencia(boolean experiencia) {
        this.experiencia = experiencia;
    }

    public void ganharExp() {
    this.experiencia = true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", experiencia=" + experiencia + '}';
    }
    
}
