package exemplos.exemploCarro;

public class Carro {
    private String sCor;
    private float fVelocidade;
    
    public void setCor(String sCor){
        //aqui dentro pode ser usada uma 
        // verificação pra validação do atributo
        this.sCor = sCor;
    }
    
    public String getCor(){
        return this.sCor;
    }

    public void setVelocidade(int fVelocidade){
        if(fVelocidade > 0){
            this.fVelocidade = fVelocidade;
        } else{
            System.out.println("velocidade invalida");
        }
        
    }
    
    public float getVelocidade(){
        return this.fVelocidade;
    }
    
    public void exibir(){
        System.out.println("o carro da cor "+ sCor + " está a uma velocidade de " 
            + fVelocidade + "km/h");
    } 
}
