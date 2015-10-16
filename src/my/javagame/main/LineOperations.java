package my.javagame.main;

public class LineOperations {
	
	public static void twoPointsToLine(Dot a, Dot b, Line l){
		l.setA(a.getPos().yPos - b.getPos().yPos);
		l.setB(b.getPos().xPos - a.getPos().xPos);
		l.setC((l.getA() * a.getPos().xPos) + (l.getB() * a.getPos().yPos));
	}
	
	public static void interseption(Line l, Line m, Dot s){
		s.getPos().setxPos(((m.getB()*l.getC()) - (l.getB()*m.getC()) / ((l.getA()*m.getB()) - (m.getA() * l.getB()))));
		s.getPos().setyPos(((m.getC()*l.getA()) - (l.getC()*m.getA()) / ((l.getA()*m.getB()) - (m.getA() * l.getB()))));
	}
}
