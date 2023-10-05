package veiculos;

public class Moto extends Veiculo{
	private String cilindrada;

	public Moto(String marca, String modelo, String cor, String ano, String cilindrada) {
		super(marca, modelo, cor, ano);
		this.cilindrada = cilindrada;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	

}
