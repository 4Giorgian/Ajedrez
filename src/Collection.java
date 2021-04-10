
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saroff
 */
public class Collection implements IterableCollection<Collection> {
    
    public Object data;
    public List<String> moves;
    
    public Collection(Object data, String move) {
        this.data = data;
        this.moves = Arrays.asList(move);
    }

    Collection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Iterator<Collection> createIterator() {
        return new CollectionIterator();
    }
    
    private class CollectionIterator implements Iterator<Collection> {
        private LinkedList<Collection> list = new LinkedList<Collection>();
        private int index = 0;
        
        public CollectionIterator() {
            add(Collection.this);
        }
        
        public void add(Collection collection) {
            list.add(collection);
        }
        
        @Override
        public boolean hasNext() {
            if(list.isEmpty()) {
                return false;
            }
            return index < list.size();
        }
        
        @Override
        public Collection next() {
            if(!hasNext()) {
                throw new RuntimeException("No hay mas elementos");
            }
            return list.get(index++);
        }
    }
    
//    public void add(Object object) {
//        Element element = new Element(object);
//        if(head == null) {
//            head = element;
//        } else {
//            Element pointer = head;
//            while (pointer.next != null) {
//                pointer = pointer.next;
//            }
//            pointer.next = element;
//        }
//        length++;
//    }
//    
//    public int size() {
//        return length;
//    }
//    
//    public boolean isEmpty() {
//        return head == null;
//    }
//    
//    public String showData() {
//        String data = "";
//        Element pointer = head;        
//        while (pointer != null) {
//            data = data + pointer.data + "\n";
//            pointer = pointer.next;
//        }
//        return data;
//    }
//    
//    @Override
//    public Iterator iterate() {
//        return new CollectionIterator();
//    }

    /**
     * This class is the template for every element in the collection
    */
//    private class Element {
//        public Object data;
//        public Element next = null;
//        
//        public Element(Object object) {
//            this.data = object;
//        }       
//    }
}
