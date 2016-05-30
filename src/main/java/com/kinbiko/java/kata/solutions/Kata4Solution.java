package com.kinbiko.java.kata.solutions;

import com.kinbiko.java.kata.Colour;

public class Kata4Solution {

	Colour col;
	
	public Colour getColourInstance(){
		if(col == null){
			col = new Red();
		} else if (col instanceof Red) {
			col = new Blue();
		} else if(col instanceof Blue){
			col = new Green();			
		}
		return col;
	}
}

/* 
 * In general, multiple classes within a single file is discouraged,
 * but in this case it ensures that the solution is contained in a single location.
 */
class Red implements Colour {
	public String getColourName() { return "Red"; }
}

class Blue implements Colour {
	public String getColourName() { return "Blue"; }
}

class Green implements Colour { 
	public String getColourName() { return "Green"; }
}