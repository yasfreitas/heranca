package Heranca;

public class PrincipalObj {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Giovana da Silva Santos", "(13)54335-3221");
		System.out.println("Pessoa: ");
		System.out.println("Nome: "+ pessoa.getNome());
		System.out.println("Telefone: "+ pessoa.getTelefone());
		
		PessoaFisica pessoaFisica = new PessoaFisica("Giovana da Silva Santos", "(13)54335-3221", "123.456.789-10", "653.861.263-8");
		System.out.println("Pessoa Física: ");
		System.out.println("Nome: "+ pessoaFisica.getNome());
		System.out.println("Telefone: "+ pessoaFisica.getTelefone());
		System.out.println("CPF: "+ pessoaFisica.getCpf());
		System.out.println("RG: "+ pessoaFisica.getRg());
		
		PessoaJuridica pessoaJ = new PessoaJuridica("Giovana da Silva Santos", "(13)54335-3221","53.865.086/5683-86");
		System.out.println("Pessoa Juridica: ");
		System.out.println("Nome: "+ pessoaJ.getNome());
		System.out.println("Telefone: "+ pessoaJ.getTelefone());
		System.out.println("CPF: "+ pessoaJ.getCnpj());

	}

}
