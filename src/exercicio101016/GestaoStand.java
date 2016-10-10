package exercicio101016;

import java.util.ArrayList;

public class GestaoStand {
	private ArrayList _transaccoes;
	private ArrayList _automoveis;
	private ArrayList _clientes;
	
	public GestaoStand(){
		_transaccoes = new ArrayList<>();
		_automoveis = new ArrayList<>();
		_clientes = new ArrayList<>();
		
		Automovel newAuto = criarCarro();
		_automoveis.add(newAuto);
		
		Cliente newCliente = criarCliente();
		_clientes.add(newCliente);
		
		Transaccao crenault = new Transaccao(Transaccao.COMPRA, newAuto, newCliente, 0);
		_transaccoes.add(crenault);
		
		Transaccao vrenault = new Transaccao(Transaccao.VENDA, newAuto, newCliente, 0);
		_transaccoes.add(vrenault);
		
		
	}

	public Automovel criarCarro(){
		Automovel a = new Automovel (2500.00, 1600, "Renault", "Megane", 120000, 2002);
		
		//Automovel b = new Automovel (1750.00, 1200, "Ford", "Focus", 285000, 1998);
		
		return a;
	}
	
	public Cliente criarCliente(){
		Cliente c = new Cliente("João Pinto", "Setubal", "123456789", 987654321);
		//Cliente c = new Cliente("Antonio Coelho", "Lisboa", "741852963", 369258147);
		
		return c;
	}
	
	public Transacao comprarCarro(Automovel carro, Cliente c){
		
		return null;
	}
	
	public Transacao venderCarro(Automovel carro, Cliente c){
		
		return null;
	}

	public ArrayList get_transaccoes() {
		return _transaccoes;
	}
	
	
}
