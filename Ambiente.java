/**
 * Classe Ambiente - um ambiente em um jogo adventure.
 *
 * Esta classe eh parte da aplicacao "World of Zuul".
 * "World of Zuul" eh um jogo de aventura muito simples, baseado em texto.  
 *
 * Um "Ambiente" representa uma localizacao no cenario do jogo. Ele eh
 * conectado aos outros ambientes atraves de saidas. As saidas sao
 * nomeadas como norte, sul, leste e oeste. Para cada direcao, o ambiente
 * guarda uma referencia para o ambiente vizinho, ou null se nao ha
 * saida naquela direcao.
 * 
 * @author  Michael Kölling and David J. Barnes (traduzido por Julio Cesar Alves)
 * @version 2011.07.31 (2016.02.01)
 */
import java.util.ArrayList;
public class Ambiente 
{
    public String descricao;
    public Ambiente saidaNorte;
    public Ambiente saidaSul;
    public Ambiente saidaLeste;
    public Ambiente saidaOeste;
    public ArrayList<Item> itens =  new ArrayList<Item>();

    /**
     * Cria um ambiente com a "descricao" passada. Inicialmente, ele
     * nao tem saidas. "descricao" eh algo como "uma cozinha" ou
     * "
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "um jardim aberto".
     * @param descricao A descricao do ambiente.
     */
    public Ambiente(String descricao) 
    {
        this.descricao = descricao;
    }

    public void setItem (Item a){
    	itens.add(a);
    }
    public void listarItens(){
    	for (int i = 0; i < itens.size(); i ++){
    		System.out.println(i + " "+ itens.get(i).getNome());
    	}
    }
    public Item coletar (int i){
    	Item c = itens.get(i);
    	itens.remove(i);
    	return c;
    }
    /**
     * Define as saidas do ambiente. Cada direcao ou leva a um
     * outro ambiente ou eh null (nenhuma saida para la).
     * @param norte A saida norte.
     * @param leste A saida leste.
     * @param sul A saida sul.
     * @param oeste A saida oeste.
     */
    public void ajustarSaidas(Ambiente norte, Ambiente leste, Ambiente sul, Ambiente oeste) 
    {
        if(norte != null)
            saidaNorte = norte;
        if(leste != null)
            saidaLeste = leste;
        if(sul != null)
            saidaSul = sul;
        if(oeste != null)
            saidaOeste = oeste;
    }

    /**
     * @return A descricao do ambiente.
     */
    public String getDescricao()
    {
        return descricao;
    }

}
