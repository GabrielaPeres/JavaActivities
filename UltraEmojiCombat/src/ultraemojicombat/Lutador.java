
package ultraemojicombat;

public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;
    
   //Métodos especiais :
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitoria, int derrota, int empate) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.empate = empate;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitoria() {
        return vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public int getEmpate() {
        return empate;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    private void setCategoria() {
        this.categoria = categoria;
        if(this.getPeso() <52.2){
            this.categoria = "inválida";
        }else if(this.getPeso() <=70.3){
            this.categoria= "leve";
        }else if (this.getPeso()<=83.9){
            this.categoria= "médio";
        }else if (this.getPeso() <=120.2){
            this.categoria = "pesado";            
        }else
            this.categoria = "inválido";

    
        
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
 
    //Métodos públicos
    public void apresentar(){
        System.out.println("-------------------------");
        System.out.println("Apresentamos Lutador:");
        System.out.println("Nome:" + this.nome);
        System.out.println("Nacionalidade:" + this.nacionalidade);
        System.out.println("Idade:" + this.idade);
        System.out.println("Altura:" + this.altura);
        System.out.println("Peso:" + this.peso);
        System.out.println("Categoria:" + this.categoria);
        System.out.println("Vitórias:" + this.vitoria);
        System.out.println("Derrotas:" + this.derrota);
        System.out.println("Empates:" + this.empate);
    }  
    public void status(){
        System.out.println("-----------------------------");
        System.out.println("Mostrando rapidamente seu status vemos que :");
        System.out.println("Nome:" + this.nome);
        System.out.println("Nacionalidade:" + this.nacionalidade);
        System.out.println("Categoria:" + this.categoria);
        System.out.println("Vitórias:" + this.vitoria);
        System.out.println("Derrotas:" + this.derrota);
        System.out.println("Empates:" + this.empate);
        
        
    }  
      
    public void ganharLuta(){
      this.setVitoria(this.getVitoria()+1);
    }  
    
    public void perderLuta(){
       this.setDerrota(this.getDerrota()+1);
    }  
     public void empatar(){
       this.setEmpate(this.getEmpate()+1);
    }  
     
}  
   
    
    
    
    
    
    
    
    
    
    

    

