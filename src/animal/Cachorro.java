package animal;

public class Cachorro extends Animal{

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public String emitirSom() {
		return "Latindo...";
	}
	
	public String correr() {
		return "Correndo...";
	}

}
