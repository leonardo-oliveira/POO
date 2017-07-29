import java.util.ArrayList;
public class Mochila {
	private int pesoMax;
	private int pesoAt;
	private ArrayList<Item> itens = new ArrayList<Item>();
	
	public Mochila(){
		pesoMax = 500;
		pesoAt = 0;
	}
	public int getPesoM(){
		return pesoMax;
	}
	public int getPesoA(){
		return pesoAt;
	}
	public void setPesoA(int peso){
		pesoAt = pesoAt + peso;
	}
	public void adicionarItem(Item a){
		itens.add(a);
	}	
	public void listarItens(){
		if (itens == null){
			System.out.println("vazia");
		}else{
			for (int i = 0; i < itens.size(); i ++){
				System.out.println(i + " " + itens.get(i).getNome());
			}
		}
	}
}

