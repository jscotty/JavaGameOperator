package my.javagame.main;

public class VectorOperations {

	public static Vector2D addVectors(Vector2D a, Vector2D b){
		Vector2D result = new Vector2D(a.xPos + b.xPos, a.yPos + b.yPos);
		return result;
	}
	public static Vector2D substractVectors(Vector2D a, Vector2D b){
		Vector2D result = new Vector2D(a.xPos - b.xPos, a.yPos - b.yPos);
		return result;
	}
	public static Vector2D scalairMultiplication(Vector2D v, float num){
		Vector2D result = new Vector2D(v.xPos*num,v.yPos*num);
		return result;
	}
	public static float dotProduct(Vector2D a, Vector2D b){
		float result = (a.xPos * b.xPos) + (a.yPos * b.yPos);
		return result;
	}
	public static float distance(Vector2D a, Vector2D b){
		float result = Math.abs(a.xPos - b.xPos) + Math.abs(a.yPos - b.yPos);
		return result;
	}
	/*
	public static Array elacticCollision(Vector2D v1, Vector2D v2, float mass1, float mass2, Vector2D x1, Vector2D x2){
		
		
		//WIP
		
		Array result = null;
		
		Vector2D x1x2 = new Vector2D();
			x1x2 = substractVectors(x1, x2);
		Vector2D x2x1 = new Vector2D();
			x2x1 = substractVectors(x2, x1);
		
		Vector2D v1v2 = new Vector2D();
			v1v2 = substractVectors(v1, v2);
		Vector2D v2v1 = new Vector2D();
			v2v1 = substractVectors(v2, v1);
		
		float part1a = 2*mass2/(mass1+mass2);
		float part2a = 2*mass1/(mass2+mass1);

		//float part1b = dotProduct((v1v2, x1x2) / (x1x2.getR() * x1x2.getR()));
		float part2b = 2*mass1/(mass2+mass1);
		
		return result;
	}*/

}
