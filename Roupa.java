public class Roupa {
	private Cor cor;
	private Tamanho tamanho;
	private Estado estado;
	
	public Cor getCor(){
		return cor;
	}
	public void setCor(Cor novaCor) {
		cor = novaCor;
	}
	public Tamanho getTamanho(){
		return tamanho;
	}
	public void setTamanho(Tamanho novoTamanho) {
		tamanho = novoTamanho;
	}
	public Estado getEstado(){
		return estado;
	}
	public void setEstado(Estado novoEstado) {
		estado = novoEstado;
	}
}