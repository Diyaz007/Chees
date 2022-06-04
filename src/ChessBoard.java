public class ChessBoard {
    private final Rectangle[][] board = new Rectangle[8][8];
    private final Circle[] circles = new Circle[12];
    public Rectangle[][] getBoard() {
        return board;
    }
    public final void fill(int x, int y, Rectangle rectangle) {
        this.board[x][y] = rectangle;
    }
}
