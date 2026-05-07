package Exercicio_2;

public class Caminhao {
    String sCombustivel;
    int iVelocidade;
    float fPesoCarga;

    public Caminhao() {
        sCombustivel = "gasolina";
        iVelocidade = 0;
        fPesoCarga = 1000;
    }

    public void setsCombustivel(String sCombustivel) {
        if(sCombustivel.equalsIgnoreCase("diesel") || sCombustivel.equalsIgnoreCase("gasolina") || sCombustivel.equalsIgnoreCase("gas")){
            this.sCombustivel = sCombustivel;
        } else {
            System.out.println("tipo de combustivel invalido");
        }
        
    }
    
    public void aumentaVelocidade(){
        if(iVelocidade == 150){
            System.out.println("o caminhao atingiu sua velocidade maxima");
        } else {
            this.iVelocidade += 10;
            System.out.println("o caminhao esta acelerando...ele esta numa veolicdade de "+ iVelocidade);
        }
        
    }
    
    public void diminuiVelocidade(){
        if(iVelocidade == 0){
            System.out.println("o caminhao ja esta parado");
        } else {
            this.iVelocidade -= 10;
            System.out.println("o caminhao esta desacelerando...ele esta numa veolicdade de "+ iVelocidade);
        }
    }
    
    public void mostarCaminhao(){
        System.out.println("O caminao esta abastecido com: "+sCombustivel+"\n"+
                           "Esta a uma velocidade de: "+iVelocidade+"km/h\n"+
                           "Carregando uma carga de: "+fPesoCarga+"kg\n");
    }

}
