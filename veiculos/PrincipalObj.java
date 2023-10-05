package veiculos;

public class PrincipalObj {

	public static void main(String[] args) {

		Veiculo veiculo = new Veiculo ("Fiat", "Uno", "2006", "branco");
		System.out.println("----------Veículo----------");
		System.out.println("Marca: "+ veiculo.getMarca());
		System.out.println("Modelo: "+ veiculo.getModelo());
	    System.out.println("Ano: "+ veiculo.getAno());
	    System.out.println("Cor: "+ veiculo.getCor());
	    
	    Automovel auto = new Automovel("Fiat", "Uno", "2006", "branco",4,"motor");
	    System.out.println("---------Automóvel---------");
	    System.out.println("MArca: "+ auto.getMarca());
	    System.out.println("Modelo: "+ auto.getModelo());
	    System.out.println("Ano: "+ auto.getAno());
	    System.out.println("Cor: "+ auto.getCor());
	    System.out.println("Número de Portas: "+ auto.getNumeroPortas());
	    System.out.println("Motor: "+ auto.getMotor());
	    
	    Moto moto = new Moto("Honda", "CG 160 Cargo", "2018", "preto", "2.000");
	    System.out.println("----------Moto----------");
	    System.out.println("Marca: "+ moto.getMarca());
	    System.out.println("Modelo: "+ moto.getModelo());
	    System.out.println("Ano: "+ moto.getAno());
	    System.out.println("Cor: "+ moto.getCor());
	    System.out.println("Cilindrada: "+ moto.getCilindrada());
	}

}
