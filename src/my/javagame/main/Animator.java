package my.javagame.main;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Animator {

	private ArrayList<BufferedImage> frames;
	private volatile boolean running = false;
	public BufferedImage sprite;
	
	private long prevTime,speed;
	private int frameAtPause;
	private int currentFrame;
	
	public Animator(ArrayList<BufferedImage> frames){
		this.frames = frames;
		
		sprite = frames.get(0);
	}
	
	public void setSpeed(long speed){
		this.speed = speed;
	}

	public void update(long time){
		if(running){
			if(time - prevTime >= speed){
				currentFrame++;
				try {
					if(currentFrame <= frames.size()){
						sprite = frames.get(currentFrame);
					}
					else{
						reset();
					}
				} catch (IndexOutOfBoundsException e) {
					reset();
					sprite = frames.get(currentFrame);
				}
				prevTime = time;
			}
		}
	}
	
	public void play(){
		running = true;
		prevTime = 0;
		frameAtPause = 0;
		currentFrame = 0;
	}
	public void stop(){
		running = false;
		prevTime = 0;
		frameAtPause = 0;
		currentFrame = 0;
	}
	public void pause(){
		running = false;
		frameAtPause = currentFrame;
	}
	public void resume(){
		running = true;
		currentFrame = frameAtPause;
	}
	public void reset(){
		running = true;
		currentFrame = 0;
	}
	public int getCurrentFrame() {
		return currentFrame;
	}
	public int getSize(){
		return frames.size();
	}
	public boolean isDoneAnimating(){
		if(currentFrame == frames.size())
			return true;
		else 
			return false;
	}
	public void nextFrame(){
		currentFrame++;
		if(currentFrame <= frames.size()){
			sprite = frames.get(currentFrame);
		} else {
			reset();
		}
	}
	public void prevFrame(){
		currentFrame--;
		if(currentFrame >= 0){
			sprite = frames.get(currentFrame);
		} else {
			sprite = frames.get(frames.size());
		}
	}
	public void setCurrentFrame(int currentFrame) {
		this.currentFrame = currentFrame;
		sprite = frames.get(currentFrame);
	}
	public long getPrevTime() {
		return prevTime;
	}
	public void setPrevTime(long prevTime) {
		this.prevTime = prevTime;
	}
}
