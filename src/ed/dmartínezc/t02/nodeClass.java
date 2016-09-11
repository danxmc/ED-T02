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
public class nodeClass<T> {
    //Atributes
    T data;
    nodeClass next;
    
    //Methods
    //Constructor
    public nodeClass(T data) {
        this.data = data;
        this.next = null;
    }
}
