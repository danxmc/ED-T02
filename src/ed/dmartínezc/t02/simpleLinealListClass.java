/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.dmartínezc.t02;

/**
 *
 * @author danx_
 */
public class simpleLinealListClass<T> {
    //Atributes
    nodeClass first;
    nodeClass last;
    
    //Methods
    //Constructor
    public simpleLinealListClass() {
        
    }
    
    public void insertFirst(T n) {
        nodeClass node = new nodeClass(n);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            node.next = first;
            first = node;
        }
    }
    
    public void insertLast(T n) {
        nodeClass node = new nodeClass(n);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
    }
    
    public void eraseLast() {
        if (isEmpty()) {
            System.out.println("Lista vacia");
        }
        if (first == last) {
            first = null;
            last = null;
        } else {
            nodeClass aux = first;
            while (aux.next != last) {
                aux = aux.next;
            }
            aux.next = null;
            last = aux;
        }
    }
    
    public void eraseFirst() {
        if (isEmpty()) {
            System.out.println("Lista vacia");
        }
        if (first == last) {
            first = null;
            last = null;
        } else {
            nodeClass aux = first;
            first = aux.next;
        }
    }
    
    private boolean isEmpty() {
        if (first == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void showList() {
        if (isEmpty() == false) {
            nodeClass aux = first;
            while(aux != null) {
                System.out.print("[" + aux.data + "] ");
                aux = aux.next;
            }
        }
        System.out.print("🙃");
    }
    
}
