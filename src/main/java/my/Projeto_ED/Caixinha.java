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
public class Caixinha {
    private int elemento;
    private Caixinha proximo;
    
    public void setElemento(int elemento){
    this.elemento = elemento;
    }
    public void setProximo(Caixinha proximo) {
        this.proximo = proximo;
    }
    public int getElemento() {
        return this.elemento; 
    }
    
    public Caixinha getProximo() {
        return this.proximo;
    }
}
