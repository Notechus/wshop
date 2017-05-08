package com.notechus.wshop.util.type;

/**
 * @author notechus.
 */
public enum ParcelSize {

    SMALL(15.0, 15.0, 15.0),
    MEDIUM(30.0, 30.0, 30.0),
    BIG(45.0, 45.0, 45.0);

    private double width;
    private double height;
    private double length;


    ParcelSize(double w, double h, double l) {
        this.width = w;
        this.height = h;
        this.length = l;
    }
}
