package my.javagame.main;

public class Vector2D {
	
	public float xPos;
	public float yPos;
	
	private float angle;
	private float r;
	
	public static float  worldXPos;
	public static float  worldYPos;
	
	public Vector2D(){
		this.xPos = 0.0f;
		this.yPos = 0.0f;
		r = (float)Math.sqrt((xPos*xPos) + (yPos*yPos));
	}

	public Vector2D(float xPos,float yPos){
		this.xPos = xPos;
		this.yPos = yPos;
		r = (float)Math.sqrt((xPos*xPos) + (yPos*yPos));
	}
	public void tick(){
		r = (float)Math.sqrt((xPos*xPos) + (yPos*yPos));
	}
	
	public void setxPos(float value) {
		this.xPos = value;
		angle = (float) Math.atan2(xPos, yPos);
		r = (float)Math.sqrt((xPos*xPos) + (yPos*yPos));
	}
	public void setyPos(float value) {
		this.yPos = value;
		angle = (float) Math.atan2(xPos, yPos);
		r = (float)Math.sqrt((xPos*xPos) + (yPos*yPos));
	}
	public float getAngle() {
		return angle;
	}
	public void setAngle(float value) {
		this.angle = value;
		xPos = (float) (r * Math.cos(angle));
		yPos = (float) (r * Math.sin(angle));
	}
	public void setAngleY(float value) {
		this.angle = value;
		yPos = (float) (r * Math.sin(angle));
	}
	public void setAngleX(float value) {
		this.angle = value;
		xPos = (float) (r * Math.cos(angle));
	}
	public float getR() {
		return r;
	}
	public void setR(float r) {
		this.r = r;
		xPos = (float) (r * Math.cos(angle));
		yPos = (float) (r * Math.sin(angle));
	}
	
	public Vector2D getScreenLocation(){
		return new Vector2D(xPos,yPos);
	}
	
	public Vector2D getWorldLocation(){
		return new Vector2D(xPos - worldXPos,yPos - worldYPos);
	}
	
	public static Vector2D zero(){
		return new Vector2D(0,0);
	}
	
	public void normalize(){
		double length = Math.sqrt((xPos*xPos)+(yPos*yPos));
		
		if(length != 0.0){
			float s = 1.0f / (float) length;
			xPos = xPos*s;
			yPos = yPos*s;
		}
	}
	
	public boolean equals(Vector2D vector){
		return(xPos == vector.xPos && yPos == vector.yPos);
	}
	
	public Vector2D copy(Vector2D vector){
		xPos = vector.xPos;
		yPos = vector.yPos;
		return new Vector2D(xPos,yPos);
	}
	
	public Vector2D add(Vector2D vector){
		xPos = xPos + vector.xPos;
		yPos = yPos + vector.yPos;
		return new Vector2D(xPos,yPos);
	}
	
	public Vector2D substract(Vector2D vector){
		xPos = xPos - vector.xPos;
		yPos = yPos - vector.yPos;
		return new Vector2D(xPos,yPos);
	}
	
	public static void setWorldVaribles(float wX, float wY){
		worldXPos = wX;
		worldYPos = wY;
	}
	
	public static double getDistanceOnScreen(Vector2D v1, Vector2D v2){ 
		float vector1 = v1.xPos - v2.xPos;
		float vector2 = v1.yPos - v2.yPos;
		
		return Math.sqrt((vector1*vector1)+(vector2*vector2));
	}
	
	public double getDistanceBetweenScreenVectors(Vector2D vector){
		float dx = Math.abs(getScreenLocation().xPos - vector.getScreenLocation().xPos);
		float dy = Math.abs(getScreenLocation().yPos - vector.getScreenLocation().yPos);
		
		return Math.abs((dx*dx) - (dy*dy));
	}
	
	public double getDistanceBetweenWorldVectors(Vector2D vector){
		float dx = Math.abs(getWorldLocation().xPos - vector.getWorldLocation().xPos);
		float dy = Math.abs(getWorldLocation().yPos - vector.getWorldLocation().yPos);
		
		return Math.abs((dx*dx) - (dy*dy));
	}
	
	public void addVector(Vector2D v){
		this.xPos = v.xPos;
		this.yPos = v.yPos;
	}
	
	public float length(){
		return (float)(Math.sqrt(xPos*xPos + yPos*yPos));
	}
	public void setLength(float value){
		if(value < 0){
			System.err.println("length can not be smaller than 0");
		} else {
			xPos = value;
			yPos = value;
		}
	}
	
	
}
