package exemplos.exemplosHerança;

public class usaFunc {
    public static void main(String[] args) {

        //herança
        PessoaFuncionario funcionario = new PessoaFuncionario();

        funcionario.mostraCartao("123456789");
        funcionario.mostraRG("98765432100");
        funcionario.nome("vinicius");

        //polimorfismo
        Pessoa pessoa = new Pessoa();
        pessoa.mostraClasse();

        Pessoa pessoaFisica = new PessoaFisica();
        pessoaFisica.mostraClasse();

        Pessoa pessoafuncionario = new PessoaFuncionario();
        pessoafuncionario.mostraClasse();
    }
}
