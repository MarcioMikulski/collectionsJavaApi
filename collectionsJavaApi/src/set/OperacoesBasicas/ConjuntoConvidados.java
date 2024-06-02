package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
//atributo
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
	
		this.convidadoSet = new HashSet<>();
	}
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for (Convidado c: convidadoSet) {
			if(c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
			//else {
			//	System.out.println("Não existe convidado com esse convite");
			//}
		}
		convidadoSet.remove(convidadoParaRemover);
	}
	public int contarConvidados() {
		return convidadoSet.size();
	}
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
	
	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		System.out.println("Existem " + conjuntoConvidados.contarConvidados()+ " Dentro do Set de Convidados");
		System.out.println();
		conjuntoConvidados.adicionarConvidado("Marcio", 1);
		conjuntoConvidados.adicionarConvidado("Roberta", 2);
		conjuntoConvidados.adicionarConvidado("Laura", 3);
		conjuntoConvidados.adicionarConvidado("Valentina", 4);
		conjuntoConvidados.adicionarConvidado("Ilza", 4);
		conjuntoConvidados.exibirConvidados();
		System.out.println("Existem " + conjuntoConvidados.contarConvidados()+ " Dentro do Set de Convidados");
		System.out.println();
		conjuntoConvidados.removerConvidadoPorCodigoConvite(1);
		System.out.println("Existem " + conjuntoConvidados.contarConvidados()+ " Dentro do Set de Convidados");
		conjuntoConvidados.exibirConvidados();
	
	}
	
}
