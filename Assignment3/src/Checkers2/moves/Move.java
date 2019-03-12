package Checkers2.moves;

import Checkers2.Checkers2;

public abstract class Move extends Checkers2 {
	
	protected int a,b,c,d;
	
	public abstract boolean LegalMove();
	
	public abstract boolean LegalSquare();
	
	public abstract String getName();
	
	public void OldCoordinates(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void NewCoordinates(int c, int d) {
		this.c = c;
		this.d = d;
	}
	

}
