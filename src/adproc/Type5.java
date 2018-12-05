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
public class Type5 extends Box{
    
    
    
    public Type5(float boxHeight, float boxLength, float boxWidth, int boxGrade, int boxColour, int boxQuantity, boolean boxBottom, boolean boxCorner, boolean sealableTop){
        height = boxHeight;
        length = boxLength;
        width = boxWidth;
        grade = boxGrade;
        quantity = boxQuantity;
        colour = boxColour;
        top = sealableTop; 
        bottom = boxBottom;
        corner = boxCorner;
    }
    
    double calculate(double blank){
        price = getSurfaceArea();
        if(grade == 3){
            gradePrice = price * 0.82;
        } else if(grade == 4){
            gradePrice = price * 0.98;
        } else if(grade == 5){
            gradePrice = price * 1.5;
        }
        if(colour == 3){
            colourPrice = price * 1.15;
        }
        if(bottom){
            bottomPrice = price * 1.13;
        }
        if(corner){
            cornerPrice = price * 1.12;
        }
        if(top){
            price *= 1.1;
        }
        
        price += gradePrice;
        price += colourPrice;
        price += bottomPrice;
        price += cornerPrice;
        price += topPrice;
        price *= quantity;
        
        System.out.println(grade);
        System.out.println(top);
        System.out.println(quantity);
        System.out.println(colour);
        System.out.println(bottom);
        System.out.println(corner);
        System.out.println("Type 5 box order: " + price);
        
        return price;
    }
    
    double getSurfaceArea(){
        double answer = Math.round((((2*(width*height))+(2*(length*height))+(width*length))/1000000)*100.00)/100.00;
        return answer;
    }
    
}
