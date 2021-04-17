import java.util.ArrayList;

public class Caretaker {
    private ArrayList<Memento> mementos ;

    public Caretaker() {
        this.mementos = new ArrayList<>();
    }

	public void addMemento(Memento m) {
        // int i = 0;
        System.out.println("ANTES....");
        this.viewArray();
        System.out.println("AGREGANDO....");
		this.mementos.add(m);
        System.out.println("DESPUÉS....");
        this.viewArray();
        // for (Memento memento : mementos) {
        //     System.out.println("MEMENTO:"+i + memento.getEstado()); 
        //     i++;
        // }
        
	}

	public Memento getMemento(int index) {
		return this.mementos.get(index);
	}

    public void viewArray() {
        
        for (int i = 0; i < this.mementos.size(); i++) {
            System.out.println("MEMENTO:"+i + mementos.get(i).getEstado()); 
        }
    }
}
