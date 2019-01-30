package hu.irt.swing.powrdiagram.elements;

/**
 *
 * @author PowR
 * This class represents one point of the chart
 */
public interface ChartPoint extends Comparable<ChartPoint>{
    /**
     * 
     * @return value of this point.<br>
     * This is the value in the Y axis
     */
    public double getX();
    /**
     * 
     * @return Position of this point in Y axis.
     */
    public double getY();
}
