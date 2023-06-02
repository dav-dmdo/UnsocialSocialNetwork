/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

/**
 *
 * @author Andrea
 */
public class List {
    private NodoEDD pfirst;
    private NodoEDD plast;
    private int size;
    
    
     public boolean isEmpty() {
        return pfirst == null;
    }

    /**
     * Inserts at the beginning
     * @param element 
     * @return node
     */
    public NodoEDD addFirst(int element) {
        NodoEDD node = new NodoEDD(element);

        if (isEmpty()) {
            setPfirst(node);
            setPlast(node);

        } else {
            node.setpNext(pfirst);
            setPfirst(node);

        }
        setSize(getSize() + 1);
        return node;
    }

    /**
     * Inserts an element at the end.
     * @param element 
     * @return node
     */
    public NodoEDD addLast(int element) {
        NodoEDD node = new NodoEDD(element);

        if (isEmpty()) {
            setPfirst(node);
            setPlast(node);
            getPfirst().setpNext(getPlast());
            getPlast().setpNext(null);

        } else {
            getPlast().setpNext(node);
            setPlast(node);

        }
        setSize(getSize() + 1);
        return node;
    }

    public int getProduct(int number){
        int start = 0;
        NodoEDD current = getPfirst();
        while(start < getSize()  && current.getpNext() != null){ 
          if(number == current.getData()){
              return current.getData();
          }
          current = current.getpNext();
        }
        return 0;
    }
    
    public String showList(){
        String list ="";
    if(!isEmpty()){
    NodoEDD aux= pfirst;
        for (int i = 0; i < size; i++) {
            list+=aux.getData()+" ";
            aux = aux.getpNext();
            
        }
}else{
        list+="No isles, the size is 0";}
    
    list += "\nThe total amount of isles is of " +this.size;
    return list;
    
    }
    /**
     * @return the pfirst
     */
    public NodoEDD getPfirst() {
        return pfirst;
    }

    /**
     * @param pfirst the pfirst to set
     */
    public void setPfirst(NodoEDD pfirst) {
        this.pfirst = pfirst;
    }

    /**
     * @return the plast
     */
    public NodoEDD getPlast() {
        return plast;
    }

    /**
     * @param plast the plast to set
     */
    public void setPlast(NodoEDD plast) {
        this.plast = plast;
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
