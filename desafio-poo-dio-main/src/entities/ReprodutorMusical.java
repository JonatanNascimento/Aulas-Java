package entities;

public abstract class ReprodutorMusical implements Iphone {

	public void tocar() {
		System.out.println("Tocar");
	}

	public void pausar() {
		System.out.println("Pausar");
	}

	public void selecionarMusica() {
		System.out.println("Selecionar musica");
	}
}
