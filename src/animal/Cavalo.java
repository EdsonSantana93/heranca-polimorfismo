package animal;

public class Cavalo extends Cachorro{

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public String emitirSom() {
		return "Relinchando...";
	}
}
