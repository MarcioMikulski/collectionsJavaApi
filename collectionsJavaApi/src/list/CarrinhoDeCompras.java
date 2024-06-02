package list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
		//atributo lista tarefa
		private List<Item> itemList;

		public CarrinhoDeCompras() {
			this.itemList = new ArrayList<>();
		}
		
		public void adicionarItem(String nome, double preco, int quantidade) {
			itemList.add(new Item(nome, preco, quantidade));
		}
		
		public void removerItem(String nome) {
			List<Item> itensParaRemover = new ArrayList<>();
			for(Item t : itemList) {
				if(t.getNome().equalsIgnoreCase(nome)) {
					itensParaRemover.add(t);
				}
			}
			itemList.removeAll(itensParaRemover);
		}
		
		public int obterNumeroTotalItem() {
			return  itemList.size();
		}
		
		
		public void obterDescricaoItens() {
			System.out.println(itemList);
		}
		public static void main(String[] args) {
			CarrinhoDeCompras itemList = new CarrinhoDeCompras();
			System.out.println("O numero total de itens no carrinho de compras é: " + itemList.obterNumeroTotalItem());
			System.out.println();
		
			itemList.adicionarItem("Computador", 1000.0, 2);
			itemList.adicionarItem("Televisão", 1200.0, 1);
			itemList.adicionarItem("Fogão", 500.0, 1);
			itemList.adicionarItem("Geladeira", 3000.0, 1);
			System.out.println("O numero total de itens no carrinho de compras é: " + itemList.obterNumeroTotalItem());
			
			System.out.println();
			itemList.removerItem("Televisão");
			System.out.println("O numero total de itens no carrinho de compras é: " + itemList.obterNumeroTotalItem());
			itemList.obterDescricaoItens();
		}
}


