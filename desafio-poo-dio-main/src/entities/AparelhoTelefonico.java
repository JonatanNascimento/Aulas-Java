package entities;

public abstract class AparelhoTelefonico implements Iphone {

	public void ligar() {
		System.out.println("Ligando para...");
	}

	public void atender() {
		System.out.println("Atender");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz");
	}
}
