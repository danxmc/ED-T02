/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.dmartínezc.t02;

/**
 *
 * @author Daniel Alexandro Martínez Ch. A00513954
 */
public class EDDMartínezCT02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        simpleLinealListClass charList = new simpleLinealListClass();
        charList.insertFirst('A');
        charList.insertFirst('H');
        charList.insertLast('L');
        charList.insertLast('L');
        charList.insertLast('O');
        charList.showList();
        charList.eraseFirst();
        charList.eraseLast();
        charList.showList();
        charList.eraseNode('A');
        charList.showList();
        
        simpleLinealListClass doubleList = new simpleLinealListClass();
        doubleList.insertFirst(10.5);
        doubleList.insertFirst(1.001);
        doubleList.insertLast(100.52);
        doubleList.insertLast(1000.689);
        doubleList.insertLast(10000.1010101);
        doubleList.showList();
        doubleList.eraseFirst();
        doubleList.eraseLast();
        doubleList.showList();
    }
    
}
