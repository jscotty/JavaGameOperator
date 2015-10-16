package my.javagame.main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RadialGradientPaint;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

public class Light {

	public Vector2D lightPos = new Vector2D();
	private int radius;
	private int lightPower;
	private BufferedImage img;
	
	public Light(float xPos, float yPos, int radius, int power) {
		this.lightPos.xPos = xPos;
		this.lightPos.yPos = yPos;
		this.radius = radius;
		this.lightPower = power;
		
		Point2D center = new Point(radius,radius);
		Point2D focus = new Point(radius,radius);
		
		float[] distance = {0f,1f};
		Color[] colors = {new Color(0,0,0,lightPower), new Color(0,0,0,0)};
		
		img = new BufferedImage(radius*2, radius*2, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g = (Graphics2D) img.getGraphics();
		
		RadialGradientPaint rgp = new RadialGradientPaint(center, radius, distance, colors);
		g.setPaint(rgp);
		
		g.fillOval(0, 0, radius*2, radius*2);
	}
	
	public void render(Graphics2D g){
		g.drawImage(img, (int)lightPos.xPos,(int)lightPos.yPos,null);
	}

}
