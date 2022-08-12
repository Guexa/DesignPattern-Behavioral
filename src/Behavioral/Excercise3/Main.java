
package Behavioral.Excercise3;

/**
 *
 * @author guexa
 * This package contain a challenge that show the Interpreted Pattern
 */
public class Main {
    
    public static void main (String[] args){
        
        String context = "_Int";
        FirstLetterNotUnderscore firstLetterNotUnderscore = new FirstLetterNotUnderscore();
        context = firstLetterNotUnderscore.interpret(context);
        System.out.println(context);
        
    }
    
}
