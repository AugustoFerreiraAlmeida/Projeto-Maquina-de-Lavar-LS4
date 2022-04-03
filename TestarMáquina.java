import java.util.Scanner;
public class TestarMáquina {
	public static void main(String[] args){
		Scanner lern = new Scanner(System.in);
		Scanner ler = new Scanner(System.in);
		System.out.println("QUAL A QUANTIDADE DE ROUPAS QUE DESEJA LAVAR? ");
		int quant = lern.nextInt();
		Roupa[] roupa = new Roupa[quant];
		for(int i = 0; i < quant; i++) {
			Roupa roupaa = new Roupa();
			for(int conf1 = 1; conf1 == 1; ) {
				System.out.println("A " + (i+1) +"° roupa é branca ou colorido? ");
				String cor = ler.nextLine();
				if(cor.equals("branca")) {
					roupaa.setCor(Cor.branco);
					conf1++;
				}
				else if(cor.equals("colorido")){
					roupaa.setCor(Cor.colorido);
					conf1++;
				}
				else {
					System.out.println("COR INVÁLIDA: ");
				}
			}
			for(int conf2 = 1; conf2 == 1; ) {
				System.out.println("A " + (i+1) +"° roupa tem qual tamanho: P, M ou G? ");
				String tam = ler.nextLine();
				if(tam.equals("P")) {
					roupaa.setTamanho(Tamanho.P);
					conf2++;
				}
				else if(tam.equals("M")){
					roupaa.setTamanho(Tamanho.M);
					conf2++;
				}
				else if(tam.equals("G")){
					roupaa.setTamanho(Tamanho.G);
					conf2++;
				}
				else {
					System.out.println("TAMANHO INVÁLIDO: ");
				}
			}
			for(int conf3 = 1; conf3 == 1; ) {
				System.out.println("QUAL O ESTADO DA " + (i+1) +"° roupa? limpa ou suja. ");
				String estado = ler.nextLine();
				if(estado.equals("limpa")) {
					roupaa.setEstado(Estado.limpa);
					conf3++;
				}
				else if(estado.equals("suja")){
					roupaa.setEstado(Estado.suja);
					conf3++;
				}
				else {
					System.out.println("ESTADO INVÁLIDO: ");
				}
			}	
			roupa[i] = roupaa;
		}
		MaquinaDeLavar maquina = new MaquinaDeLavar();
		if(maquina.Lavar(roupa) == -1){
			System.out.println("Não é possivél lavar. ");
		}
		else {
			System.out.println(maquina.Lavar(roupa) + " Minutos, esse é o tempo necessário para lavar essas roupas. ");
		}
	}
}