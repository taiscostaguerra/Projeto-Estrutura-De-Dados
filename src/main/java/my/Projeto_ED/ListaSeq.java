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
public class ListaSeq{
        private final int dados[];
    private int tamAtual;
    private final int tamMax;

    public ListaSeq() {

        tamAtual = 0;
        tamMax = 100;
        dados = new int[tamMax];
    }

    public boolean Vazia() {

        if (tamAtual == 0) {
            return true;
        } else
            return false;

    }

    public boolean Cheia() {

        if (tamAtual == 100) {
            return true;
        } else
            return false;

    }

    public int tamanhoLista() {

        return tamAtual;

    }

    public int Elemento(final int pos) {

        if (pos > tamAtual || pos < 0) {
            return -1;
        } else
            
            return dados[pos];
    }

    public int Posicao(final int elem) {

        for (int i = 0; i <= tamAtual; i++) {

            if (dados[i] == elem) {

                return i;
            }

        }

        return -1;

    }

    public boolean Insere( int pos,  int elem) {

        
        if (pos > tamanhoLista()){ return false;}
        
        for (int i = tamAtual; i > pos; i--) {

            dados[i] = dados[i - 1];

        }

        dados[pos] = elem;
        tamAtual++;

        return true;

    }

    public boolean Remove(int pos) {

        if (pos > tamAtual || pos < 0 || Vazia()) {
            return false;
        }

        for (int i = pos; i <= tamAtual; i++) {

            dados[i] = dados[i + 1];

        }

        tamAtual--;

        return true;

    }

    public void Imprimir(){

        for (int i = 0; i < tamAtual; i++) {

            System.out.println(Elemento(i));

        }

    }

    public void Zerar(){

        for (int i = 0; i <= tamAtual; i++) {

            dados[i] = 0;

        }

        tamAtual = 0;

    }

   

}
