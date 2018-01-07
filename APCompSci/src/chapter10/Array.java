package chapter10;

//Project 10-3, 10-4, 10-5
public class Array {


	private int [] occurence = new int[10];
	public double findMode(double [] myArray ){
		int times = 0, lowCount = 1;
		double low = -9999; 
		for(int i = 0; i < 10; i++){
			double element = myArray[i];
			for (int j = 0; j < 10; j++){
				if (element == myArray[j])
					times++;
			}
			if (times > lowCount){
				low = myArray[i];
				lowCount = times;
			}
			occurence[i] = times;
			times = 0;
		}
		return low;
	}
	public double findMedian (double [] myArray){
		int start = 1, end = myArray.length-1, index = 0;
		double temp;
		for (int i = 0; i < myArray.length; i++){
		double smallest = myArray[i];	
			for (int j = start; j <= end; j++){
				if (myArray[j] <= smallest){
					smallest = myArray[j];
					index = j;
				} 
				
			}
			if (myArray[i] == smallest)
				index = i;
			temp = myArray[i];
			myArray[i] = smallest;
			myArray[index] = temp;
			start++;
		}
		int middle = (myArray.length/2);
		double element = myArray[middle];
		if (middle*2 == myArray.length){
			element = (element + myArray[middle - 1])/2;
		}
		return element;
	}
	
	
	
	public void displayTable (double [] myArray) {
		System.out.print("\nYour numbers: ");
		for (double element : myArray)
			System.out.printf("%10.3f|", element);
		System.out.print("\n Frequencies: ");
		int times = 0, lowCount = 1;
		for(int i = 0; i < 10; i++){
			double element = myArray[i];
			for (int j = 0; j < 10; j++){
				if (element == myArray[j])
					times++;
			}
			if (times > lowCount){
				lowCount = times;
			}
			occurence[i] = times;
			times = 0;
		}
		for (int element : occurence)
			System.out.printf("%10d|", element);
	}
		
	
	
}
