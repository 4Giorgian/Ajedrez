public class Memento {
        private ChessGameLog estado;
    
        public Memento(ChessGameLog estado) {
            this.estado = estado;
        }
    
        public ChessGameLog getEstado() {
            return this.estado;
        }
}
