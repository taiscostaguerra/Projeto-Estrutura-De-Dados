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
public class ListaEncadeada {
    
    private Caixinha inicio;
    
    
        
    public ListaEncadeada() {
        this.inicio = null;
              
    }
    
    public void Remove(int posicao){
        
        if (posicao < 0){return;}
        
        if (posicao == 0){
            removerInicio();
            
        }
        else if (posicao == getTamanho() - 1){
            removerFim();
            
        }
        
        else {
            removerMeio(posicao);
            
        }
        
    }
    
    public void Insere(int elemento,int posicao){
        
        if (posicao < 0){return;}
        
        if (posicao == 0){
            inserirInicio(elemento);
            
        }
        else if (posicao == getTamanho() - 1){
            inserirFim(elemento);
            
        }
        
        else {
            inserirMeio(elemento,posicao);
            
        }
        
    }
        
    
    public void inserirFim(int elemento) {
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
    
    public void inserirInicio(int elemento) {
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
    
    public void inserirMeio(int elemento, int posicao) {
    	
    	Caixinha nova = new Caixinha();
    	Caixinha aux = inicio;
    	Caixinha aux2;
    	    	
    	nova.setElemento(elemento);
    	
    	if(posicao > getTamanho() || posicao < 0 ) {
    		return;
    	}
    	
    	if(posicao == 0 ) {
    		inserirInicio(elemento);
    	}
    	else {
    		for(int i = 0 ; i < posicao - 1 ; i++ ) {
	    		
        		aux = aux.getProximo();
        		
        	}
        	
    		aux2 = aux.getProximo();	
    		aux.setProximo(nova);
        	nova.setProximo(aux2);
        }
    	
    }
    
    
    

    
    public int removerInicio() {
    	
    		if(isEmpty()) {
    			System.out.println("Lista vazia, erro ao remover!");
    			return -1;
    		}
    		Caixinha aux = inicio;
    		int elemento = aux.getElemento();
    		inicio = aux.getProximo();
    		return elemento;
    		
    	}
    
    public int removerMeio(int posicao) {
    	if(isEmpty()) {
			System.out.println("Lista vazia, erro ao remover!");
			return -1;
		}
    	if(posicao >= getTamanho() || posicao < 0 ) {
    		return -1;
    	}
    	
    	if(posicao == 0 ) {
    		removerInicio();
    	}
    	
    	Caixinha aux = inicio;
    	Caixinha anterior = new Caixinha();
    	    	
    	for(int i = 0; i < posicao; i++) {
    		anterior = aux;
    		aux = aux.getProximo();
    	}
    	int elemento = aux.getElemento();
    	anterior.setProximo(aux.getProximo());
    		
    	
    	
    	return elemento;
    }
    
    public int removerFim() {
    	Caixinha aux = inicio;
    	Caixinha anterior = new Caixinha();
    	if(isEmpty()) {
			System.out.println("Lista vazia, erro ao remover!");
			return -1;
		}
    	
    	for(int i = 0 ; i < getTamanho() - 1 ; i++) {
    		anterior = aux;
    		aux = aux.getProximo();
    	}
    	
    	int elemento = aux.getElemento();
    	anterior.setProximo(null);
    	 
    	 
    	 return elemento;
    	
    }
    
    public int Posicao(int elemento) {
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
