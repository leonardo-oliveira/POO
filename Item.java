public class Item{
	private String nome;
	private int peso;
	private String descricao;

	public Item(String nomeA, int pesoA, String descricaoA){
		nome = nomeA;
		peso = pesoA;
		descricao = descricaoA;
	}
	// vai ser polimorfico
	public String getNome(){
		return nome;
	}

	public String getDesc(){
		return descricao;
	}
	public int getPeso(){
		return peso;
	}
}