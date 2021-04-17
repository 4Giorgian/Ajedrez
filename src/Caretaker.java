import java.util.ArrayList;

public class Caretaker {
    private ArrayList<Memento> mementos = new ArrayList<>();

	public void addMemento(Memento m) {
        int i = 0;
		mementos.add(m);
        for (Memento memento : mementos) {
            System.out.println("MEMENTO:"+i + memento.getEstado()); 
            i++;
        }
        
	}

	public Memento getMemento(int index) {
		return mementos.get(index);
	}
}
