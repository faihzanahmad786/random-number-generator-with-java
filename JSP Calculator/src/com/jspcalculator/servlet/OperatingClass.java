package com.jspcalculator.servlet;

public class OperatingClass {
	private int number1;
	 private int number2;
	 private String operator;
	 private double result2;
	 private int result1;
	 
	 public OperatingClass(int number1, int number2, String operator) {
	  this.number1 = number1;
	  this.number2 = number2;
	  this.operator = operator;
	 }
	 
	 public void calc() {
	   switch(operator) {
	      case "+ (Addition)":
	       result1=number1+number2;
	       break;
	      case "- (Subtraction)":
	       result1=number1-number2;
	       break;
	      case "* (Multiplication)":
	       result1=number1*number2;
	       break;
	      case "/ (Division)":
	       result2=(double)number1/(double)number2;
	       break;
	      case "% (Modulus)" :
	    	  result1=number1%number2;
	       break;
	      }
	 }
	 
	 public int getResult1() {
	  return result1;
	  
	 }
	 public double getResult2() {
	  return result2;
	 }
}
