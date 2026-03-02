String/*
 * This is an example solution for the String Analyser program which forms the first
 * Practical Skills Assessment on COM102.
 *
 * @author COM102
 * Date created: Feb 2024
 * Version 1.0
 */
package com102;

import java.util.Scanner ;


public class StringAnalyzer{
	
    //Array for matching letters as string is analysed
	private char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'} ;
    //array that holds the frequency of occurences of each letter in its respictive index positon 'a'=0, 'z'=25
    private int[] frequency = new int[26];
	
	
    
    public static void main(String[] args){
        // Instantiating self class so we can make use of the instance variables declared herewith and
        // avoid the need to make more methods in this class static.
            
        StringAnalyzer myAnalyzer = new StringAnalyzer() ;
        
        myAnalyzer.start() ;
    }
    
    private void start(){
        // Decomposing the problem into a discrete set of well focussed steps.
            
        this.getString() ;
        this.analyzeString() ;
        this.reportAnalysis() ;  
                    
        System.out.println("Program Terminating, Goodbye");
    }
	//
	//Your Task - Complete thje following 3 methods as instructed in the spec.
	//1. getString() - Read a string of text from keyboard
	//2. encryptString() - Perform encryption on the strinig as required
	//3. reportAnalysis() - Print the results back to the user on the screen 
	// Feel free to declare other variables as needed.
	
    
} // End of class StringAnalyser