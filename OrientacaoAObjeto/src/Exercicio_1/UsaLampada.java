package Exercicio_1;

public class UsaLampada {
    public static void main(String[] args) {
        Lampada led = new Lampada();
        
        System.out.println("led");
        
        led.ligar();
        
        led.observar();
        
        System.out.println("--------------------");
        
        Lampada incandescente = new Lampada();
        
        System.out.println("incandescente");
        
        incandescente.desligar();
        
        incandescente.observar();
    }
}
