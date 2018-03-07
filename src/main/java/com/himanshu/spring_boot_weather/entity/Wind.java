package com.himanshu.spring_boot_weather.entity;

public class Wind {

	double speed;
	int degree;
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getDegree() {
		return degree;
	}
	public void setDegree(int degree) {
		this.degree = degree;
	}
	@Override
	public String toString() {
		return "Wind [speed=" + speed + ", degree=" + degree + "]";
	}
}
