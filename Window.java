//this creates the window for the game
package com.tutorial.main;

import java.awt.Canvas;

//https://www.mkyong.com/java/how-to-generate-serialversionuid/
//need to try and make a serialversion id for "window" don't know how
public class Window extends Canvas{

//need private static final long serialversionid = -898379287 or something, hover over "window above.."
public Window (int width, int height, String title){
    JFrame frame = new JFrame(title, Game game);

    frame.setPreferredSize(new Dimension(width,height));
    frame.setMaximumSize(new Dimension(width,height));
    frame.setMinimumSize(new Dimension(width,height));

    frame.setDefaultCloseOperations(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);
    frame.add(game);
    frame.setVisible(true);
    game.start();
}

}
