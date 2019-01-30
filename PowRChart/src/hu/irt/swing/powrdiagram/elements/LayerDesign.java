/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.irt.swing.powrdiagram.elements;

import java.awt.Graphics;

/**
 *
 * @author PowR
 */
public interface LayerDesign {
    /**
     * Draws a line between two points according to this design
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @param g 
     */
    public void drawPath(int x1,int y1,int x2, int y2,Graphics g);
}
