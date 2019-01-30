/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.irt.swing.powrdiagram.elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author PowR
 */
public class DataLayer {
    private List<ChartPoint> points = new ArrayList<>();
    

    public DataLayer includePoints(ChartPoint... points){
        if(points!=null) this.points.addAll(Arrays.asList(points));
        return this;
    }
    
    public DataLayer includePoints(Collection<ChartPoint> points){
        if(points!=null) this.points.addAll(points);
        return this;
    }
    
    public List<ChartPoint> getPoints() {
        return points;
    }

    public void setPoints(List<ChartPoint> points) {
        this.points = points==null?new ArrayList<>():points;
    }
    
}
