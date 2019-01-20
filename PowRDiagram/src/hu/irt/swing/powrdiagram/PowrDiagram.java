/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.irt.swing.powrdiagram;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author PowR
 */
public class PowrDiagram extends JComponent{
    public PowrDiagram(){
        
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawLine(0, 0, this.getWidth(), this.getHeight());
        super.paint(g);
    }
}
