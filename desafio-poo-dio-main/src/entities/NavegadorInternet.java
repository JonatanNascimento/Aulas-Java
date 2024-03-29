package entities;

public abstract class NavegadorInternet implements Iphone {

	public void exibirPagina() {
		System.out.println("Pagina exibida.");
	}

	public void adicionarNovaAba() {
		System.out.println("Nova Aba.");
	}

	public void atualizarPagina() {
		System.out.println("Pagina atualizada.");
	}
}
