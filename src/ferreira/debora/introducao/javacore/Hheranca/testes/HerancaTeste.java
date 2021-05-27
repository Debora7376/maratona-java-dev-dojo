package ferreira.debora.introducao.javacore.Hheranca.testes;

import ferreira.debora.introducao.javacore.Hheranca.classes.Endereco;
import ferreira.debora.introducao.javacore.Hheranca.classes.Funcionario;
import ferreira.debora.introducao.javacore.Hheranca.classes.Pessoa;

class HerancaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Kaguya");
        Endereco endereco = new Endereco();
        pessoa.setCpf("346583");
        endereco.setRua("Rua Celeste");
        endereco.setBairro("Bairro ceu");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("-------------------------------");
        Funcionario funcionario = new Funcionario("Renji");
        funcionario.setCpf("2681238");
        funcionario.setSalario(15000);
        funcionario.setEndereco(endereco);
        funcionario.imprime();
    }
}
/*
* 1) Espaço em memoria é alocado para o objeto sendo construido.
* 2) Cada um dos atributos do objeto é criado e inicializado com os valores default.
* 3) O construtor da superclasse é chamado.
* 4) A inicialização dos atributos via declação e o codigo de bloco de inicialização da superclasse são executados na ordem  em que aparecem.
* 5) O codigo de construtor da subclasse é executado.
* 6) Passo 4 para a subclasse é executado.
* 7) O codigo do construtor da classe é executado.
*/