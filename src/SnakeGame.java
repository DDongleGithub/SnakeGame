import javax.swing.*;

//SnakeGame class extends to JFrame to get all properties of JFrame class
public class SnakeGame extends JFrame {
    private GameBoard board;
        public SnakeGame(){
            board = new GameBoard();
            add(board);
            setResizable(false);
            pack();

            setLocationRelativeTo(null);
            setBounds(200,150,400,400);
            setVisible(true);
        }
        public static void main(String[] args){
            JFrame snakeGame = new SnakeGame();
        }
}
