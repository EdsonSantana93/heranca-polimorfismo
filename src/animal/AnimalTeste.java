package animal;

public class AnimalTeste {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Totó", 2);
		
		System.out.println(cachorro.getNome());
		System.out.println(cachorro.getIdade());
		System.out.println(cachorro.emitirSom());
		System.out.println(cachorro.correr());
		
		
		System.out.println("-------------------------");
		
		Cavalo cavalo = new Cavalo("Pé de Pano", 5);
		
		System.out.println(cavalo.getNome());
		System.out.println(cavalo.getIdade());
		System.out.println(cavalo.emitirSom());
		System.out.println(cavalo.correr());
		
		
		System.out.println("--------------------------");
		
		Preguica preguica = new Preguica("Dorme Tanto", 1);
		System.out.println(preguica.getNome());
		System.out.println(preguica.getIdade());
		System.out.println(preguica.emitirSom());
		System.out.println(preguica.subir());
		
	}

}
