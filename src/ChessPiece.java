abstract public class ChessPiece {
    String color;
    Boolean chek = true;

    public ChessPiece(String color) {
        this.color = color;
    }
    abstract public String getColor();
    abstract public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);
    abstract public String getSymbol();
}
