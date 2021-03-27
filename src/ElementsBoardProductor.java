public class ElementsBoardProductor {
    public static AbstractElementsBoardFactory getTypeElementBoard(String typeElementBoard){
        if (typeElementBoard.equalsIgnoreCase("PIECE")) {
			return new PieceFactory();

		} else if (typeElementBoard.equalsIgnoreCase("SQUARE")) {
			return new SquareFactory();
		}

		return null;
    };
}
