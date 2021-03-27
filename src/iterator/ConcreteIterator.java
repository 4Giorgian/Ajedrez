/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author Saroff
 */
public class ConcreteIterator implements Iterator {
    
    public ConcreteCollection collection;
    
    public ConcreteIterator (ConcreteCollection c) {
        collection = c;
    }
    
    @Override
    public boolean hasNext() {
        return false;
    }
    
    @Override
    public Object next() {
        return 0;
    }
}
