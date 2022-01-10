package patinete;

public class Patinete {
	//atributos
	
		private String cor;
		private String tamanho;
		private int idadeRec;
		
		//metodos
		
		void valor(String preço) {
			System.out.println("O valor do patinete é: R$:XXX,XX");
		}
		void acessorio(String preço) {
			System.out.println("Acessório incluso: Capacete ");
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public String getTamanho() {
			return tamanho;
		}
		public void setTamanho(String tamanho) {
			this.tamanho = tamanho;
		}
		public int getIdadeRec() {
			return idadeRec;
		}
		public void setIdadeRec(int idadeRec) {
			this.idadeRec = idadeRec;
		}

}
