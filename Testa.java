package atividadePolimoerfetica;

import java.util.ArrayList;

public class Testa {

	public static void main(String[] args) {
		
		Caminhao c=new Caminhao(null, 0, 0);
		Onibus o=new Onibus(null, 0, 0);
		ArrayList<String> junta=new ArrayList<String>();//Armazena Placas
		ArrayList<Integer> junta1=new ArrayList<Integer>();//Armazena Anos
		ArrayList<Integer> junta2=new ArrayList<Integer>();//Armazena Assentos
		ArrayList<Integer> junta3=new ArrayList<Integer>();//Armazena Eixos
		ArrayList<Object> tudo=new ArrayList<Object>();//Armazena todas as informaçoes dos outros ArrayList
		
		o.setPlaca("AAA-1111");
		junta.add(o.getPlaca());
		o.setAno(2000);
		junta1.add(o.getAno());
		o.setAssentos(41);
		junta2.add(o.getAssentos());
		o.exibirDados(null, 0);
		
		o.setPlaca("ABC-1234");
		junta.add(o.getPlaca());
		o.setAno(2005);
		junta1.add(o.getAno());
		o.setAssentos(45);
		junta2.add(o.getAssentos());
		o.exibirDados(null, 0);
		
		o.setPlaca("BBB-2222");
		junta.add(o.getPlaca());
		o.setAno(2010);
		junta1.add(o.getAno());
		o.setAssentos(42);
		junta2.add(o.getAssentos());
		o.exibirDados(null, 0);
		
		o.setPlaca("CCC-3333");
		junta.add(o.getPlaca());
		o.setAno(2015);
		junta1.add(o.getAno());
		o.setAssentos(43);
		junta2.add(o.getAssentos());
		o.exibirDados(null, 0);
		
		o.setPlaca("DDD-4444");
		junta.add(o.getPlaca());
		o.setAno(2020);
		junta1.add(o.getAno());
		o.setAssentos(44);
		junta2.add(o.getAssentos());
		o.exibirDados(null, 0);
		
		
		
		c.setPlaca("EFG-5678");
		junta.add(c.getPlaca());
		c.setAno(2022);
		junta1.add(c.getAno());
		c.setEixos(9);
		junta3.add(c.getEixos());
		c.exibirDados(null, 0);
		
		c.setPlaca("EEE-5555");
		junta.add(c.getPlaca());
		c.setAno(1982);
		junta1.add(c.getAno());
		c.setEixos(2);
		junta3.add(c.getEixos());
		c.exibirDados(null, 0);
		
		c.setPlaca("FFF-6666");
		junta.add(c.getPlaca());
		c.setAno(1992);
		junta1.add(c.getAno());
		c.setEixos(3);
		junta3.add(c.getEixos());
		c.exibirDados(null, 0);
		
		c.setPlaca("GGG-7777");
		junta.add(c.getPlaca());
		c.setAno(2002);
		junta1.add(c.getAno());
		c.setEixos(4);
		junta3.add(c.getEixos());
		c.exibirDados(null, 0);
		
		c.setPlaca("HHH-8888");
		junta.add(c.getPlaca());
		c.setAno(2012);
		junta1.add(c.getAno());
		c.setEixos(7);
		junta3.add(c.getEixos());
		c.exibirDados(null, 0);
		//testando os arraylist
		/*for(String placas: junta) {
			System.out.println(junta);
		}
		for(int anos : junta1) {
			System.out.println(junta1);
		}
		for(int assentos : junta2) {
			System.out.println(junta2);
		}
		for(int eixos : junta3) {
			System.out.println(junta3);
		}*/
		//Passando tudo pra um so
		tudo.addAll(junta);
		tudo.addAll(junta1);
		tudo.addAll(junta2);
		tudo.addAll(junta3);
		
		System.out.println("A seguir todas as informacoes:");
		
		for( Object tudo1 : tudo) {
			System.out.println(tudo);
		}




	}
	
	

}
