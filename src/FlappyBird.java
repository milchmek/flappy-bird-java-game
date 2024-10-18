import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class FlappyBird extends JPanel{
    int boardWidth = 360;
    int boardHeight = 640;

    // images
    Image backGroundImg;
    Image birdImg;
    Image topPipeImg;
    Image bottomPipeImg;

    FlappyBird() {
        setPreferredSize(new Dimension(boardWidth, boardHeight)); // set preferred size to board width and height
//        setBackground(Color.blue); // set background color

        // load images
        backGroundImg = new  ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();
        birdImg = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();
        topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
        bottomPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        // set the background Image
        g.drawImage(backGroundImg, 0, 0, boardWidth, boardHeight, null);
    }
}
