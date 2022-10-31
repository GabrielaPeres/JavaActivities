package aula011;

public class Professor extends Pessoa {

    private int salario;
    private String area;

    public int getSalario() {
        return salario;
    }

    public String getArea() {
        return area;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void aumentarSalario() {
        this.setSalario(this.getSalario() + 500);

    }
}
