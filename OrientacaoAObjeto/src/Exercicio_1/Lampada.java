package Exercicio_1;

public class Lampada {
    boolean lStatus;
    
    public void ligar(){
        lStatus = true;
    }
    public void desligar(){
        lStatus = false;
    }
    public void observar(){
        if(lStatus){
            System.out.println("a lampada esta ligada");
        } else {
            System.out.println("a lampada esta desligada");
        }
    } 
}
