package edu.towson.cis.cosc442.project2.rectangle;

// TODO: Auto-generated Javadoc
/**
 * The Class Rectangle.
 */
public class Rectangle {
	
	/** The p2. */
	private Point p1, p2;
	
	/**
	 * Instantiates a new rectangle.
	 *
	 * @param p1 the p1
	 * @param p2 the p2
	 */
	Rectangle(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
		
		//First addition to find issue
		//System.out.println("Points are x is "+this.p1.x+" y is "+this.p1.y);
		//System.out.println("Points 2 are x is "+this.p2.x+" y is "+this.p2.y+"\n");
	}
	
	/**
	 * Gets the area.
	 *
	 * @return the area
	 */
	public Double getArea() {
		return Math.abs((p2.x - p1.x) * (p2.y - p1.y));
	}
	
	/**
	 * Gets the diagonal.
	 *
	 * @return the diagonal
	 */
	public Double getDiagonal() {
		return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
	}
	public Point[] getPoints(){//this would add valuable incite into the values used in calculations
		Point[] tempPoints = {new Point(p1.x,p1.y), new Point(p2.x,p2.y)};
		return tempPoints;
	}
}