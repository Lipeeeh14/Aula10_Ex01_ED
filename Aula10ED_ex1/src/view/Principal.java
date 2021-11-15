package view;

import java.util.ArrayList;

import controller.FuncoesListaController;

public class Principal {

	public static void main(String[] args) 
	{
		FuncoesListaController f = new FuncoesListaController();
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		
		l1.add(1);
		l2.add(2);
		l1.add(7);
		l2.add(6);		
		l1.add(5);
		l2.add(4);
		l1.add(3);
		
		f.copiarLista(l1);	
		System.out.println();
		f.intercalaListas(l1, l2);
		System.out.println();
		f.ordenaLista(l1);
	}
	
	
}
