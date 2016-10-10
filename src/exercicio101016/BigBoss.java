package exercicio101016;

import java.util.ArrayList;

public class BigBoss {
	ArrayList _stands;
	
	public BigBoss(){
		_stands = new ArrayList<GestaoStand>();
		
		GestaoStand raminhos = new GestaoStand();
		_stands.add(raminhos);
		
		lucrosStand(raminhos);
	}
	
	private void lucrosStand(GestaoStand stand){
		ArrayList tr = stand.get_transaccoes();
		
		double lucro= 0,
			vendas= 0,
			compras= 0;
		
		for(int i=0; i<tr.size(); i++){
			Transaccao t = (Transaccao) tr.get(i);
			
			if (t.getTipo() == Transaccao.COMPRA){
				compras = compras + t.getPreco();
			}
			else if /// fazer o mesmo para as vendas
		}
		
		System.out.println("O Stand lucrou" + (vendas - compras) + "€");
	}

}
