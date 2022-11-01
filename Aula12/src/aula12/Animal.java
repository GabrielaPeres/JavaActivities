package aula12;

public abstract class Animal {

    protected int peso;
    protected int idade;
    protected int membros;

    public int getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public abstract void locomover();

    public abstract void alimentar();

    public abstract void emitirSom();
}
