package chapter7;

//Project 7-7
public class AreaPerimeterPoss {
	public static void main (String [] args){
		int height, width;
		int time=0;
		int area, perimeter;
		System.out.println("Height   Width   Area  Perimeter");
		for (int i = 1; i < 11; i++){
			height = i;
			for (int j = 1; j < 11; j++){
				width = j;
				area = height * width;
				perimeter = 2*height + 2*width;
				System.out.println("   " + height + "      " + width + "       " + area  + "       " + perimeter);
				time++;
			}
		}
		System.out.println(time + " combinations");
	}
}
