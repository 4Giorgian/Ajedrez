/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sono Cattivo
 */
public class Memento {
    
    private ChessGameLog estado;

	public Memento(ChessGameLog estado) {
		this.estado = estado;
	}

	public ChessGameLog getEstado() {
		return estado;
	}
    
}
