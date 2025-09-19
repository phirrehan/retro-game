package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel {

  // screen settings
  final int originalTileSize = 16; // 16x16
  final int scale = 3;
  final int tileSize = originalTileSize * scale; // 48x48
  final int maxScreenCol = 16;
  final int maxScreenRow = 12;
  final int screenWidth = tileSize * maxScreenCol; // 768 px
  final int screenHeight = tileSize * maxScreenRow; // 576 px

  public GamePanel() {
    this.setPreferredSize(new Dimension(screenWidth, screenHeight));
    this.setBackground(Color.black);
    this.setDoubleBuffered(true);
  }

}
