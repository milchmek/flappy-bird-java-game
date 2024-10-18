import javax.swing.*;

public class App {
    public static void main(String[] args) {
        int boardWidth = 360; // set width of the window
        int boardHeight = 640; // set height of the window

        JFrame frame = new JFrame("Flappy Bird"); // set the title
//        frame.setVisible(true); // set show on the window
        frame.setSize(boardWidth, boardHeight); // set width and height
        frame.setLocationRelativeTo(null); // set display on center
        frame.setResizable(false); // set cannot resize the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set when close the game, the game will exit

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        frame.setVisible(true);
    }
}
