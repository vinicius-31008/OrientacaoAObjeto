package Exercicio_2;

public class UsaCaminhao {
    public static void main(String[] args) {

        Caminhao mercedes = new Caminhao();
        
        mercedes.setsCombustivel("diesel");

        mercedes.aumentaVelocidade();
        mercedes.aumentaVelocidade();
        mercedes.diminuiVelocidade();
        mercedes.diminuiVelocidade();
        mercedes.diminuiVelocidade();
        
        System.out.println("--------------------------------");
        
        mercedes.mostarCaminhao();

    }
}
