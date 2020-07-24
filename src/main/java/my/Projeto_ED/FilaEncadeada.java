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
public class FilaEncadeada {
     private Caixinha inicio;
    
    
        
    public FilaEncadeada() {
        this.inicio = null;
              
    }
        
    
    public void Insere(int elemento) {
        Caixinha nova = new Caixinha();
               
            nova.setElemento(elemento);
            nova.setProximo(null);
        
            if(inicio == null) {
                inicio = nova;                
                
            }
            else {
                Caixinha aux;
                aux = inicio;
                while(aux.getProximo() != null) {
                    aux = aux.getProximo();
                }
                aux.setProximo(nova);
            }
        
    }
    
    
    public void Remove() {
    	
    		if(isEmpty()) {
    			return;
    		}
    		Caixinha aux = inicio;
    		int elemento = aux.getElemento();
    		inicio = aux.getProximo();
    		
    		
    	}
    

    
   
    public int buscaPosicaoElemento(int elemento) {
    	Caixinha aux = inicio;
    	int contador = 0;
    	    	
    	if(isEmpty()) {
    		return -1;
    	}
    	while(aux != null) {
    		if(aux.getElemento() == elemento) {
    			System.out.println("O elemento " + elemento + " foi encontrado na posição " + contador);
    			
    		}
    		aux = aux.getProximo();
    		contador++;
    	}
    	return 0;
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
     *s
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
    	System.out.println(tamanho+1);
    	return (tamanho + 1);
    	
    }
    
    public int Primeiro() {
    	if(isEmpty()) {
    		return -1;
    	}
    	
    	System.out.println(inicio.getElemento());
    	return (inicio.getElemento());
    }
}
