/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.Projeto_ED;

import java.lang.reflect.Array;

public class Pilha {
	 private Caixinha inicio;
    
    
        
    public Pilha() {
        this.inicio = null;
              
    }
        
    public void Insere(int elemento) {
    	Caixinha nova = new Caixinha();
    	
    	    	
    	nova.setElemento(elemento);
    	nova.setProximo(inicio);
    	
    	if(isEmpty()) {
    		inicio = nova;
    		
    		nova.setProximo(null);
    		
    	}
    	else {
    		nova.setProximo(inicio);
    		inicio = nova;
    	}
    }
    
       

    
    public int Remove() {
    	
    		if(isEmpty()) {
    			System.out.println("Lista vazia, erro ao remover!");
    			return -1;
    		}
    		Caixinha aux = inicio;
    		int elemento = aux.getElemento();
    		inicio = aux.getProximo();
    		return elemento;
    		
    	}
           
    public int buscaPosicaoElemento(int elemento) {
    	Caixinha aux = inicio;
    	int contador = 0;
    	    	
    	if(isEmpty()) {
    		System.out.println("Lista vazia!");
    	}
    	while(aux != null) {
    		if(aux.getElemento() == elemento) {
    			System.out.println("O elemento " + elemento + " foi encontrado na posição " + contador);
    			return contador;
    		}
    		aux = aux.getProximo();
    		contador++;
    	}
    	return -1;
    }  	
	
    public int Elemento(int posicao) {
    	Caixinha aux = inicio;
    	
    	
    	if(isEmpty()) {
    		System.out.println("Lista vazia!");    	}
    	
    	if(posicao < 0 || posicao > getTamanho()) {
    		System.out.println("Posição inválida!");
    	}
    	
    	for(int i = 0; i < posicao ; i++ ) {
    		aux = aux.getProximo();
    	}
    	
    	System.out.println("O elemento " + aux.getElemento() + " foi encontrado na posição " + posicao);
    	
    	return (aux.getElemento());
    	
    	
    }
    
    
    
    
    /**
     *
     */
    public void Listar() {
        if(isEmpty()) {
            System.out.println("A lista está vazia");
        }
        else {
            Caixinha aux = inicio;
            while(aux != null) {
                System.out.println("Elemento visto " + aux.getElemento());
                aux = aux.getProximo();
                
            }
        }
    }

    public boolean isEmpty() {
        return (this.inicio == null);
    }
           
    
    public int getTamanho() {
    	int tamanho = 0;
    	Caixinha aux = new Caixinha();
    	aux = inicio;
    	while (aux.getProximo() != null) {
    		aux = aux.getProximo();
    		tamanho++;
    		}
    	return (tamanho + 1);
    	
    }
	
	
}

