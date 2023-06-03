/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo.Recorridos;

import EDD.List;

/**
 *
 * @author Andrea
 */
public class Results {
    private List listaDeIslasRecorridas;
    private int size;

    
    //CONSTRUCTOR
    public Results() {
        this.listaDeIslasRecorridas = null;
        this.size = 0;
    }
    public Results(List listaDeIslasRecorridas, int size) {
        this.listaDeIslasRecorridas = listaDeIslasRecorridas;
        this.size = listaDeIslasRecorridas.getSize();
    }

    /**
     * @return the listaDeIslasRecorridas
     */
    public List getListaDeIslasRecorridas() {
        return listaDeIslasRecorridas;
    }

    /**
     * @param listaDeIslasRecorridas the listaDeIslasRecorridas to set
     */
    public void setListaDeIslasRecorridas(List listaDeIslasRecorridas) {
        this.listaDeIslasRecorridas = listaDeIslasRecorridas;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
   
}
