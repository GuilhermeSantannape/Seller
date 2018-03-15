/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;




import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.io.BufferedReader;



import Model.Clientes;

/**
 *
 * @author Guilherme Santanna
 */


public class ListaEncadeada<T> {
	String Lista[] = new String[400];
	 private int Tamanho;
	 Clientes Cliente = new Clientes();
	 
	
	private T dado;
	private No<T> head=null; 
	private No<T> tail=null; 
	 
	
	public void append(T dado)
	{
		No<T> novo = new No<>(dado);
		if (ListVazia()) {
			head = novo;
			tail = novo;
		} else {
			novo.setAnterior(tail);
			tail.setProximo(novo);
			tail=novo;
		}
		
		Tamanho++;
	}		
		
	

	 private boolean ListVazia () { // lista vazia
			return (this.head==null);
			
		}
	
	 private static class No<T> {
			private T dado;
			private No<T> anterior;
			private No<T> proximo;
			
			
			public No<T> getAnterior() {
				return anterior;
			}
			public void setAnterior(No<T> anterior) {
				this.anterior = anterior;
			}
			public T getDado() {
				return dado;
			}
			public void setDado(T dado) {
				this.dado = dado;
			}
			public No<T> getProximo() {
				return proximo;
			}
			public void setProximo(No<T> proximo) {
				this.proximo = proximo;
			}
			public No(T dado) {
				this.dado = dado;
				this.proximo = null;
				this.anterior = null;
			}
		}
	public void addFirst(T dado) {
		No<T> novo = new  No<>(dado);
		if (ListVazia()) {
		
			head=novo;
			tail=novo;
		}else {
			head.setAnterior(novo);
			novo.setProximo(head);
			head=novo;
		}
		Tamanho++;
	
	
	}
	public T search(T key, Comparator<T> cmp) {
		No<T> i = head;
		T obj = null;
		while (i != null) {
		obj = i.getDado();
	if (cmp.compare(key,obj) == 0)
				break;
			i = i.getProximo();
		}
		if (i == null) {
		System.out.println(" Sem informações");
			obj = null;
		}
		
		return obj;
	}
	public void printObjects()
	{	
		 	
		 	No<T> x = head;
		 		while (x != null) {
		 			System.out.println(x.getDado());
		 			x = x.getProximo();
		 		}
	}
	
	public static ListaEncadeada<Model.Clientes> loadFromFile(FileReader Contatos){
		 
		  BufferedReader ler = new BufferedReader(Contatos);
			ListaEncadeada<Clientes> Registro = new ListaEncadeada<Clientes>();
			try {
				String linha = ler.readLine();
				
	while(linha != null) {
				
		String[] atributos = linha.split(",");
		Clientes Clientes = new Clientes();
		Clientes.setCnpj(atributos[0]);
		Clientes.setSite(atributos[1]);
	
		Registro.append((Clientes) Clientes);
                System.out.println("  "+Clientes);
		linha = ler.readLine();
            
				}
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			return Registro;
		}

   
}
