package ex12;

public class Car {

	private String color;
	private String gearType ;
	private int    door;
	
	Car () {
		this("white","auto",4);
	}
	
	
	Car (String color) {
		this(color,"auto",4);
	}
	
	Car (String color,String gearType) {
		this(color,gearType,4);
	}
	
	Car (String color, String gearType,int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
