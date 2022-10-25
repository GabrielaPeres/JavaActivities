package projetopessoas;

public class ProjetoPessoas {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Funcionario p3 = new Funcionario();
        Professor p4 = new Professor();

        p1.setNome("Amanda");
        p2.setNome("Lana");
        p3.setNome("Rene");
        p4.setNome("Lina");

        p1.setIdade(20);
        p2.setIdade(25);
        p3.setIdade(50);
        p4.setIdade(18);

        p1.setSexo("F");
        p2.setSexo("F");
        p3.setSexo("F");
        p4.setSexo("F");

        p2.setCurso("mimica");
        p2.setMatricula(250);

        p3.setTrabalhando(true);
        p3.setFuncionario("Arqueologa");

        p4.setEspecialidade("Etiqueta");
        p4.setSalario(1000);

        
        
        
        
    }

}
