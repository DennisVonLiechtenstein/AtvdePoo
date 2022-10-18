package atividadePolimoerfetica;

public abstract class Veiculo {
	private String placa;
	private int ano;
	public Veiculo() {
		
	}
	public Veiculo(String placa,int ano) {
		placa=this.placa;
		ano=this.ano;
	}
		
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	


	abstract void exibirDados(String placa,int ano);
	

}
