/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sono Cattivo
 */
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
		this.estado = m.getEstado();
	}
    
}
