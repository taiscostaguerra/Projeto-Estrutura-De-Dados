/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.Projeto_ED;

/**
 *
 * @author taiscguerra
 */
public class Fila {
	private int primeiro;
	private int ultimo;
	private int total;
	private int elementos[];


	public Fila(int tamanho) {
		primeiro = 0;
		ultimo = 0;
		total = 0;
		elementos = new int [tamanho];
	
	}
	
	public boolean isFull() {
		return (total == elementos.length);
	}
	
	public boolean isEmpty() {
		return (total == 0);
	}
	
	public void Insere(int dados) {
		
		if(isFull()) {
			throw new RuntimeException ("Fila cheia, não pode adicionar mais!");
		}
                
                
		
		elementos[ultimo] = dados;
		ultimo = (ultimo + 1) % elementos.length;
		total ++;
		
	}
	
	public void Remove() {
		
		if(isEmpty()) {
			throw new RuntimeException ("Fila vazia, não pode remover!");
		}
		
            int dados = elementos[0];
		primeiro = (primeiro + 1) % elementos.length;
		total --;
		
		
		
	}
	
	public int getTamanho() {
		return total;
	}
	
	public int getTotal() {
		return total;
	}
        
        public int Elemento(int pos){
         
            return elementos[pos];
            
        }
        
        public int Primeiro(){
        if(isEmpty()){return -1;}
        return elementos[0];
        }
	
}