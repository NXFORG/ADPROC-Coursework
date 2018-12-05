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

public class Type1 extends Box{

    public Type1(float boxHeight, float boxLength, float boxWidth, int boxGrade, int boxQuantity, boolean sealableTop){
        height = boxHeight;
        length = boxLength;
        width = boxWidth;
        grade = boxGrade;
        quantity = boxQuantity;
        top = sealableTop;
    }
    
    double calculate(double blank){
        price = getSurfaceArea();
        
        if(grade == 1){
            price *= 0.55;
        } else if(grade == 2){
            price *= 0.65;
        } else if(grade == 3){
            price *= 0.82;
        }
        if(top == true){
            price *= 1.1;
        }
        price *= quantity;
        System.out.println(grade);
        System.out.println(top);
        System.out.println(quantity);
        System.out.println("Type 1 box order: " + price);
        
        return price;
        
    }
    
    double getSurfaceArea(){
        double answer = (2*(width*height))+(2*(length*height))+(width*length);
        return answer;
    }
    
}