abstract public class ChessPiece {
    String color;
    Boolean chek = true;

    public ChessPiece(String color) {
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn){
        return chek.booleanValue();

    }
}
