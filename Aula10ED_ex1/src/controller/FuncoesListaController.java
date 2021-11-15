package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FuncoesListaController {

	public FuncoesListaController() { }
	
	public <T> void intercalaListas(ArrayList<T> l1, ArrayList<T> l2) {
		for (int i = 0; i <= l1.size(); i++) {
			if (i % 2 != 0 && !l2.isEmpty())
				l1.add(l2.remove(0));
		}
		
		exibeElementosLista(l1);
	}
	
	public <T> void divideLista(ArrayList<T> l1, int quantidadeListas) {
		int qtdeElementos = l1.size() / quantidadeListas;
		ArrayList<T>[] resultado = new ArrayList[quantidadeListas];
		int grupo = 0;
		
		for (int i = 0; i < l1.size(); i++) {
			if (resultado[grupo] == null)
				resultado[grupo] = new ArrayList<T>();
				
			resultado[grupo].add(l1.get(i));
			
			if ((i + 1) % qtdeElementos == 0) {
				exibeElementosLista(resultado[grupo]);
				grupo = grupo + 1;
			}
			
		}			
	}
	
	public <T> void copiarLista(ArrayList<T> lista) {
		ArrayList<T> listaCopia = new ArrayList<T>();
		
		listaCopia = (ArrayList<T>) lista.clone();
		
		exibeElementosLista(listaCopia);
	}
	
	public void ordenaLista(ArrayList lista) {
		Collections.sort(lista);
		exibeElementosLista(lista);
	}
	
	private <T> void exibeElementosLista(ArrayList<T> l1) {
		for (T valor : l1) System.out.println(valor);
	}
}
