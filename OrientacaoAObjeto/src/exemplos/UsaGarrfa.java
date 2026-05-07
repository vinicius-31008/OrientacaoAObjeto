package exemplos;

public class UsaGarrfa {
    public static void main(String[] args){
        Garrafa gStanley = new Garrafa();
        
        gStanley.sTipoMaterial = "metal";
        gStanley.iCapacidade = 500;

        gStanley.esvaziar();
        gStanley.encher();

        gStanley.mostrar();
        
        System.out.println("----------------------------------------------");
        
        Garrafa ks = new Garrafa(350);
        
        ks.sTipoMaterial = "vidro";
        
        ks.esvaziar();
        ks.encher();

        ks.mostrar();
    }
}