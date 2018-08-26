package project0000;

public class Plane {
	private String type;
	Airline myAirline;
	public Plane (String t, String a){
		myAirline = new Airline(a);
		type = t;
	}
	public String getType(){
		return type;
	}
	public String toString(){
		return myAirline.getAirline()  + " has a " + type + " plane.";
	}
}
