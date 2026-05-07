package exemplos;

public class UsaCarro {
    public static void main(String[] args) {
        Carro byd = new Carro();
        
        byd.setCor("azul");
        byd.setVelocidade(140);
        
        byd.exibir();

        System.out.println("------------------------------");
        
        System.out.println(byd.getCor());
        System.out.println(byd.getVelocidade());
    }
}
