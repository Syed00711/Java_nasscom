package com.microcare.advanced;

public class Circle {
private double radius;

public Circle(double radius) {
	this.radius=radius;
}

public double getArea() {
	return Math.PI*this.radius*this.radius;
}
public double getPerimeter() {
	return 2* Math.PI*this.radius;
}
@Override
public String toString() {
	return "CIrcle[radius="+this.radius+"}";
}
}
