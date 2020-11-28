package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<TipoDados> {
	
	
	private List<TipoDados> list = new ArrayList<>();
	

	public void adicionarValor(TipoDados valor) {
		list.add(valor);
		
	}
	public TipoDados primeiro() {
		if(list.isEmpty()) {
			throw new IllegalStateException("Lista está vazia");
			
		}
		return list.get(0);
	}

	public void print() {
		System.out.print("[");
		if(!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		
		
		for(int i=1;i<list.size();i++) {
			System.out.print(", "+list.get(i));
		}
		System.out.print("]");
		
	}
	@Override
	public String toString() {
		return "PrintService [list=" + list + "]";
	}

	
	

}
