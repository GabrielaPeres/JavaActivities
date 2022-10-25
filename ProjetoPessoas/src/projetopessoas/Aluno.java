package projetopessoas;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

       public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void cancelarMatricula(){
        System.out.println("Cancelando matrícula");
    }
   
    
    
}

