/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

/**
 *
 * @author gabri
 */
public class celular {
    String cor;
    String modelo;
    int memoria;
    boolean ligado;
    String marca;
    boolean foto;
    boolean post;
    
    void ligado(){
        if(this.ligado == true){
         System.out.println("funcionando normal");
        }else{
         System.out.println("não está funcionando");
        } 
   
    }
    void tirandoFoto(){
       if (this.ligado == true){
           System.out.println("click");}
    else{
           System.out.println("Não é possivel tirar fotos!");
    }
}
    void postando(){
        if (this.post == true){
        System.out.println("postado com sucesso");
        }
        else{
        System.out.println("ocorreu um erro");
        }
    }
    
}

