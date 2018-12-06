/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adproc;

/**
 *
 * @author chris
 */
public abstract class Box {
    float height, length, width;
    double gradePrice, price, topPrice, colourPrice, bottomPrice, cornerPrice;
    int grade, quantity, colour;
    boolean bottom, corner, top;
    
    abstract double calculate(double blank);
    abstract double getSurfaceArea();
}
