package my.javagame.main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Dot extends Rectangle implements MouseListener,MouseMotionListener,MouseWheelListener{
	
	public Vector2D pos;
	public Vector2D velocity;
	public float mass;
	public double rotation;
	public int radius;
	
	private int color;
	private int r = 0,g = 0,b = 0;
	private boolean dragable;

	public Dot(Vector2D pos, int color, int radius, float mass, boolean dragable) {
		this.pos = pos;
		this.color = color;
		this.radius = radius;
		this.mass = mass;
		this.dragable = dragable;
		
	}
	
	public Dot(Vector2D pos,Vector2D velocity, int color, int radius, float mass, boolean dragable) {
		this.pos = pos;
		this.velocity = velocity;
		this.color = color;
		this.radius = radius;
		this.mass = mass;
		this.dragable = dragable;
	}
	
	public Dot(Vector2D pos,Vector2D velocity, int r, int g, int b, int radius, float mass, boolean dragable) {
		this.pos = pos;
		this.velocity = velocity;
		this.r = r; this.g = g; this.b = b;
		this.radius = radius;
		this.mass = mass;
		this.dragable = dragable;
	}
	
	public void render(Graphics2D g){
		g.rotate(rotation);
		if(r == 0 && this.g == 0 && b == 0)
			g.setColor(Color.red);
		else
			g.setColor(new Color(r,this.g,b));
			
		g.fillOval((int)(pos.xPos) - (radius / 2), (int)(pos.yPos) - (radius / 2), radius, radius);
		g.setColor(Color.white);
		g.drawOval((int)(pos.xPos) - (radius / 2), (int)(pos.yPos) - (radius / 2), radius, radius);
	}
	
	public Vector2D getPos() {
		return pos;
	}
	public int getRadius() {
		return radius;
	}
	public float getMass() {
		return mass;
	}
	public float xPos(){
		return pos.xPos;
	}
	public float yPos(){
		return pos.yPos;
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
