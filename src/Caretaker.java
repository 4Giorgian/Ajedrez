
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sono Cattivo
 */
public class Caretaker {
    
    private ArrayList<Memento> mementos = new ArrayList<>();

	public void addMemento(Memento m) {
		mementos.add(m);
	}

	public Memento getMemento(int index) {
		return mementos.get(index);
	}
    
}
