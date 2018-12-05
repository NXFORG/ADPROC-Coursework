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
    float height;
    float length;
    float width;
    double gradePrice;
    double price;
    double topPrice;
    double colourPrice;
    double bottomPrice;
    double cornerPrice;
    int grade;
    int quantity;
    int colour;
    boolean bottom;
    boolean corner;
    boolean top;
    
    abstract double calculate(double blank);
    abstract double getSurfaceArea();
}
