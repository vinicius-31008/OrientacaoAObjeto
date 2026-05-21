package exemplos.exemplosHerança;

public class PessoaFuncionario extends PessoaFisica {
    public String cartao;

    public void mostraCartao(String cartao){
        System.out.println(cartao);
    }

    public void mostraClasse(){
        System.out.println("FUNCIONARIO");
    }
}
