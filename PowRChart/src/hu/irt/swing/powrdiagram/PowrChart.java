package hu.irt.swing.powrdiagram;

import hu.irt.swing.powrdiagram.elements.ChartPoint;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;

/**
 *
 * @author PowR
 */
public class PowrChart extends JComponent{
    
    
    
    public PowrChart(){
        this.setSize(200, 100);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawLine(0, 0, this.getWidth(), this.getHeight());
        super.paint(g);
    }

    
}
