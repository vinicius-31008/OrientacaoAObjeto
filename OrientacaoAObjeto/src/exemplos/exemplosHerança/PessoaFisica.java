package exemplos.exemplosHerança;

public class PessoaFisica extends Pessoa{
    public String rg;

    public void mostraRG(String rg){
        System.out.println(rg);
    }

    public void mostraClasse(){
        System.out.println("PESSOA FISICA");
    }
}
