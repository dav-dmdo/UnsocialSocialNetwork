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
public class Stack {

    private NodoEDD top;
    private NodoEDD base;
    private int size;

    public Stack() {
        this.top = null;
        this.base = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void empty() {
        this.top = this.base = null;
        this.size = 0;
    }

    public NodoEDD pile(int t) {
        NodoEDD toAdd = new NodoEDD(t);
        if (this.isEmpty()) {
            top = base = toAdd;
        } else {
            toAdd.setpNext(top);
            top = toAdd;
        }
        size++;
        return toAdd;

    }

    public NodoEDD unpile() {
        NodoEDD toReturn = null;
        if (!this.isEmpty()) {
            if (size == 1) {
                toReturn = top;
                this.empty();

            } else {
                toReturn = top;
                top = top.getpNext();
                size--;
            }

        }
        return toReturn;
    }

    public String print(String printStack) {
        if (!this.isEmpty()) {
            NodoEDD actual = top;
            this.unpile();
            printStack += print(printStack);
            this.pile(actual.getData());
        }
        return printStack;
    }

}
