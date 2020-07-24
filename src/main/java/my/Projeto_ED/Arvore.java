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
public class Arvore {
     private No raiz;
private String resultado;
	
	public Arvore(){
		raiz = null;
	}
	
	public String Resultado() {
		
		return resultado;
		
	}
	

	public boolean vazia (){
		return (raiz == null);
	}


	private No busca(No T, int valor) {
		if (T == null)
			return null; 

		if(T.getConteudo() == valor)
			return T; 	
		
		if (valor < T.getConteudo())
			return busca(T.getEsq(), valor);
	    else
			return busca(T.getDir(), valor);
	}
	
	
	public No busca(int valor) {          
		
			return busca(raiz, valor);
		
		
	}
	
	
	
	
	private void exibePreOrdem(No T) {
		if (T == null)
			return;
	
		
		//System.out.print(" " + T.getConteudo());
		resultado = resultado + Integer.toString(T.getConteudo()) + " ";
		
	
		if (T.getEsq() != null)
			exibePreOrdem(T.getEsq());
	

	 	if (T.getDir() != null)
			exibePreOrdem(T.getDir());
	}

	public void exibePreOrdem() {
		resultado = " ";

		if (raiz == null)
			System.out.println("Arvore vazia");
		else
			exibePreOrdem(raiz);
	}	
	
	
	private void exibeInOrdem(No T) {

		if (T == null)
			return ;

		if (T.getEsq() != null)
			exibeInOrdem(T.getEsq());
	
	    //System.out.print(" " + T.getConteudo());
	    resultado = resultado + Integer.toString(T.getConteudo()) + " ";
	
	 	if (T.getDir() != null)
			exibeInOrdem(T.getDir());
	}

	
	
	
	public void exibeInOrdem() {
		resultado = " ";

		if (raiz == null)
			System.out.println("Arvore vazia");
		else
			exibeInOrdem(raiz);
	}	
	

	private void exibePosOrdem(No T) {
		
		if (T == null)
			return ;

		if (T.getEsq() != null)
			exibePosOrdem(T.getEsq());
	
	 	if (T.getDir() != null)
			exibePosOrdem(T.getDir());

	 	//System.out.print(" " + T.getConteudo());
	 	resultado = resultado + Integer.toString(T.getConteudo()) + " ";

	}
	
	
	public void exibePosOrdem() {
	 	resultado = " ";

		if (raiz == null)
			System.out.println("Arvore vazia");
		else
			exibePosOrdem(raiz);
	}
	
	

	
	
	public boolean insere(int valor){

		No novoNo = new No();
		novoNo.setConteudo(valor);
		novoNo.setEsq(null);
		novoNo.setDir(null);

		if (raiz == null){ 
	 		raiz = novoNo;
			return true;
		}

	   
	    No aux = raiz;
	    No p = null;
	    while (aux != null) {
	    	p = aux;
			if (valor < aux.getConteudo())
				aux = aux.getEsq();
			else
				aux = aux.getDir();
		}

		
		if (valor < p.getConteudo())
			p.setEsq(novoNo);
		else
			p.setDir(novoNo);
		return true;
	}

}
