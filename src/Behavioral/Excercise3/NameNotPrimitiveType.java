
package Behavioral.Excercise3;

//  This package contain a challenge that show the Interpreted Pattern

public class NameNotPrimitiveType implements Expression {

    @Override
    public String interpret(String context) {
        if(context.equals("int") || context.equals("booean") || context.equals("double")){
            context = context + "1";
        }
        return context;
    }
    
}
