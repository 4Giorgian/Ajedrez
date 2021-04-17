public class Originator {
    private ChessGameLog estado;

	public void setEstado(ChessGameLog estado) {
		this.estado = estado;
	}

	public ChessGameLog getEstado() {
		return estado;
	}

	public Memento guardar() {
		return new Memento(estado);
	}

	public void restaurar(Memento m) {
         System.out.println("MEMENTO 0 ?: "+ m );
		this.estado = m.getEstado();
	}
}
