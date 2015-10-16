package my.javagame.main;

public class Calculate {
	
	private float slope;
	private float intercept;
	
	public Calculate(float slope, float intercept){
		this.slope = slope;
		this.intercept = intercept;
	}
	
	public float calculateY(float x_in){
		return slope * x_in - intercept;
	}
}
