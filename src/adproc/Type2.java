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
public class Type2 extends Box {

    public Type2(float boxHeight, float boxLength, float boxWidth, int boxGrade, int boxColour, int boxQuantity, boolean sealableTop) {
        height = boxHeight;
        length = boxLength;
        width = boxWidth;
        grade = boxGrade;
        quantity = boxQuantity;
        colour = boxColour;
        top = sealableTop;
    }

    double calculate(double blank) {
        price = getSurfaceArea();
        if (grade == 2) {
            gradePrice = price * 0.65;
        } else if (grade == 3) {
            gradePrice = price * 0.82;
        } else if (grade == 4) {
            gradePrice = price * 0.98;
        }
        if (colour == 2) {
            colourPrice = price * 1.12;
        }
        if (top) {
            topPrice = price * 1.1;
        }
        
        price += gradePrice;
        price += colourPrice;
        price += topPrice;
        price *= quantity;
        
        System.out.println(grade);
        System.out.println(top);
        System.out.println(quantity);
        System.out.println(colour);
        System.out.println("Type 2 box order: " + price);
        
        return price;
    }

    double getSurfaceArea() {
        double answer = Math.round((((2*(width*height))+(2*(length*height))+(width*length))/1000000)*100.00)/100.00;
        return answer;
    }

}
