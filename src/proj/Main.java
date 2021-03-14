/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;
    import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneLayout;
import javax.swing.WindowConstants;
import javax.swing.plaf.basic.BasicScrollBarUI;
/**
 *
 * @author emada
 */



public class Main {

    /**
     *
     * @param args
     */
    
}

class MyScrollBarUI extends BasicScrollBarUI {
  private final Dimension d = new Dimension();


  

 
 

  @Override
  protected void paintTrack(Graphics g, JComponent c, Rectangle r) {
  }

  @Override
  protected void paintThumb(Graphics g, JComponent c, Rectangle r) {
    Graphics2D g2 = (Graphics2D) g.create();
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
    Color color = null;
    JScrollBar sb = (JScrollBar) c;
    if (!sb.isEnabled() || r.width > r.height) {
      return;
    } else if (isDragging) {
      color = (new Color(244,128,36));
    } else if (isThumbRollover()) {
      color = Color.LIGHT_GRAY;
    } else {
      color = Color.GRAY;
    }
    g2.setPaint(color);
    g2.fillRoundRect(r.x, r.y, r.width, r.height, 10, 10);
    g2.setPaint(Color.GRAY);
    g2.drawRoundRect(r.x, r.y, r.width, r.height, 10, 10);
    g2.dispose();
  }

  @Override
  protected void setThumbBounds(int x, int y, int width, int height) {
    super.setThumbBounds(x, y, width, height);
    scrollbar.repaint();
  }
}

