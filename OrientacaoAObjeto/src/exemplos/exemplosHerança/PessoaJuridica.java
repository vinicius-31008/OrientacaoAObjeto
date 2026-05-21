package exemplos.exemplosHerança;

public class PessoaJuridica extends PessoaFisica {
    public String cnpj;

    public void cnpj(String cnpj){
        System.out.println(cnpj);
    }

    public void mostraClasse(){
        System.out.println("PESSOA JURIDICA");
    }
}
