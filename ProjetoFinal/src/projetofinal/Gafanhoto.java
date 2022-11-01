package projetofinal;

public class Gafanhoto extends Pessoa {

    private String login;
    private int toAssistido;

    public Gafanhoto(String nome, int idade, String sexo, boolean experiencia) {
        super(nome, idade, sexo, experiencia);
        this.login = login;
        this.toAssistido = 0;

    }

    public String getLogin() {
        return login;
    }

    public int getToAssistido() {
        return toAssistido;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setToAssistido(int toAssistido) {
        this.toAssistido = toAssistido;
    }

    public void viuMaisUm() {
    this.toAssistido ++;
    }
}
