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
            gradePrice = price * 0.55;
        } else if(grade == 2){
            gradePrice = price * 0.65;
        } else if(grade == 3){
            gradePrice = price * 0.82;
        }
        if(top == true){
            topPrice = price * 1.1;
        }
        
        price += gradePrice;
        price += topPrice;
        price *= quantity;
        
        System.out.println(grade);
        System.out.println(top);
        System.out.println("Quantity: " + quantity);
        System.out.println("Type 1 box order: " + price);
        
        return price;
        
    }
    
    double getSurfaceArea(){
        double answer = Math.round((((2*(width*height))+(2*(length*height))+(width*length))/1000000)*100.00)/100.00;
        return answer;
    }
    
}