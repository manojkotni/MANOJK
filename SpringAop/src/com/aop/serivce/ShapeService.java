package com.aop.serivce;

import com.aop.model.Circle;
import com.aop.model.Triangle;

public class ShapeService {
	private static Circle circle; 
	private Triangle triangle;
	public Circle getCircle() {
		return circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
}


