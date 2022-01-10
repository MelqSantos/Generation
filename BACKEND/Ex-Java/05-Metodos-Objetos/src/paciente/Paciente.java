package paciente;

public class Paciente {
	
	private String nome;
	private String documento, tipoS;
	private String BancoS[] = new String[5];
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getTipoS() {
		return tipoS;
	}
	public void setTipoS(String tipoS) {
		this.tipoS = tipoS;
	}
	public String[] getBancoS() {
		return BancoS;
	}
	
	
	

}
