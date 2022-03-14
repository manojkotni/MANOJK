package com.dependancy;

public class Student {
	private int id;
	private MathCheat mathcheat ;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setMathcheat(MathCheat  mathcheat) {
		this.mathcheat = mathcheat;
	}

	public void cheating(){
		
		mathcheat.mathCheat();
		}
}
