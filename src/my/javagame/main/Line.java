package my.javagame.main;

public class Line {
	
	private float slope;
	private float intercept;
	private float a;
	private float b;
	private float c;
	private float norm;
	
	public Line(float a, float b, float c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public float calculateX(float x_in){
		return (c - a * x_in) / b;
	}
	public float calculateY(float y_in){
		return (c - b * y_in) / a;
	}
	public void normalize(){
		norm = (a*a) + (b*b);
		
		a = a / norm;
		b = b / norm;
		c = c / norm;
	}
	
	public float getA() {
		return a;
	}
	public void setA(float a) {
		this.a = a;
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
	public float getC() {
		return c;
	}
	public void setC(float c) {
		this.c = c;
	}
	public float getIntercept() {
		return intercept;
	}
	public void setIntercept(float intercept) {
		this.intercept = intercept;
	}
	public float getNorm() {
		return norm;
	}
	public void setNorm(float norm) {
		this.norm = norm;
	}
	public float getSlope() {
		return slope;
	}
	public void setSlope(float slope) {
		this.slope = slope;
	}
}
