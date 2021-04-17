public class Originator {
    private ChessGameLog estado;

	public void setEstado(ChessGameLog estado) {
		this.estado = estado;
	}

	public ChessGameLog getEstado() {
		return this.estado;
	}

	public Memento guardar() {
		// System.out.println("ESTADO: "+ estado);
		return new Memento(this.estado);
	}

	public void restaurar(Memento m) {
        //  System.out.println("MEMENTO 0 ?: "+ m.getEstado() );
		this.estado = m.getEstado();
	}
}
