package atividadePolimoerfetica;

public class Onibus extends Veiculo {
	private int assentos;
	
	public Onibus(String placa,int ano,int assentos){
		placa=super.getPlaca();
		ano=super.getAno();
		assentos=this.assentos;
		
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	

	

	@Override
	void exibirDados(String placa, int ano) {
		
		System.out.print("Veiculo=Onibus Placa= ");

		System.out.print(getPlaca());
		System.out.print(" Ano= ");
		System.out.print(getAno());
		System.out.print(" Assentos= ");
		System.out.print(getAssentos());
		System.out.println("\n");
		
		
	}

}
