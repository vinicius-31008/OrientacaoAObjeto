package exemplos.exemploGarrafa;

public class Garrafa {
    String sTipoMaterial;
    int iCapacidade;
    
    public void esvaziar(){
        System.out.println("Esvaziando a garrafa");
    }
    public void encher(){
        System.out.println("Enchencdo a garrafa");
    }
    public void mostrar(){
        System.out.println("Material: " + sTipoMaterial
                + "\ncapacidade: " + iCapacidade + "ml");
    }
    
    //construtor vazio
    public Garrafa(){}
    
    //contrutor com parametro
    public Garrafa(int iCapacidade){
      this.iCapacidade = iCapacidade;
    }
}
