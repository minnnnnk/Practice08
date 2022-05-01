package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Add a1 = new Add();
    	Div d1 = new Div();
    	Mul m1 = new Mul();
    	Sub s1 = new Sub();
    	System.out.print(">>");
    	String num = sc.nextLine();
    	num = a1.calculate(sc.nextInt());
    	a1.setValue(0, 0);
    	
    	
    	while(true) {
    		
    		
        	if(num == a1) {
        		a1.calculate(sc.nextInt());
        	} break;
    	} 
    	
    	
    	sc.close();
    	
    }
}
