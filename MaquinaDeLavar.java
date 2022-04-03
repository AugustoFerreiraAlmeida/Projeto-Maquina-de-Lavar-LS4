public class MaquinaDeLavar {
	public int Lavar(Roupa[] roupa) {
		int tempo = 0;
		int lavar = 0;
		int tam = roupa.length;
		for(int i = 0; i < tam ; i++ ) {
			if(roupa[0].getCor().equals(roupa[i].getCor())){
				lavar = 1;
			}
			else {
				return -1;
			}
		}
		if(lavar == 1){
			for(int i = 0; i < tam ; i++ ) {
				roupa[i].setEstado(Estado.limpa);
			}
			for(int i = 0; i < tam ; i++ ) {
				if(roupa[i].getTamanho().equals(Tamanho.P)) {
					tempo += 3;
				}
				else if(roupa[i].getTamanho().equals(Tamanho.M)) {
					tempo += 5;
				}
				else {
					tempo += 8;
				}
			}
			for(int i = 0; i < tam ; i++ ) {
				if(roupa[i].getCor().equals(Cor.colorido)) {
					tempo += 2;
				}
				else {
					tempo += 1;
				}
			}
			for(int i = 0; i < tam ; i++ ) {
				if(roupa[i].getEstado().equals(Estado.suja)) {
					tempo += 3;
				}
			}
		}	
		return tempo;
	} 
}

