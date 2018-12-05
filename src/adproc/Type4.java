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
public class Type4 extends Box{
 
    public Type4(float boxHeight, float boxLength, float boxWidth, int boxGrade, int boxColour, int boxQuantity, boolean boxBottom, boolean sealableTop){
        height = boxHeight;
        length = boxLength;
        width = boxWidth;
        grade = boxGrade;
        quantity = boxQuantity;
        colour = boxColour;
        top = sealableTop; 
        bottom = boxBottom;
    }
    
    double calculate(double blank){
        price = getSurfaceArea();
        if(grade == 2){
            price *= 0.65;
        } else if(grade == 3){
            price *= 0.82;
        } else if(grade == 4){
            price *= 0.98;
        } else if(grade == 5){
            price *= 1.5;
        }
        if(colour == 3){
            price *= 1.15;
        }
        if(bottom){
            price *= 1.13;
        }
        if(top){
            price *= 1.1;
        }
        price *= quantity;
        System.out.println(grade);
        System.out.println(top);
        System.out.println(quantity);
        System.out.println(colour);
        System.out.println(bottom);
        System.out.println("Type 4 box order: " + price);
        
        return price;
    }
    
    double getSurfaceArea(){
        double answer = (2*(width*height))+(2*(length*height))+(width*length);
        return answer;
    }
    
}
