package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
	/**
	 * @param anotherString
	 * @return
	 * @see java.lang.String#compareTo(java.lang.String)
	 */
	public int compareTo(Produto p) {
		return nome.compareToIgnoreCase(p.getNome());
	}




	//atributos
	private long codigo;
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(long codigo, String nome, double preco, int quantidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	/**
	 * @return the codigo
	 */
	public long getCodigo() {
		return codigo;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the preco
	 */
	public double getPreco() {
		return preco;
	}

	/**
	 * @return the quantidade
	 */
	public int getQuantidade() {
		return quantidade;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Produto produto)) return false;
		return getCodigo()== produto.getCodigo();
	}
	
	public int hashCode() {
		return Objects.hash(getCodigo());
	}
	

	

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	
	
	
}

class ComparatorPorPreco implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		// TODO Auto-generated method stub
		return Double.compare(p1.getPreco(), p2.getPreco());
	}
	
		
	
}