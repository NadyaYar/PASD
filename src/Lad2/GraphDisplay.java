public class GraphDisplay {

	public static void main(String[] args) {
		int n = 100;
		
		int[] array = new int[n];
		for (int i = 0; i < n; i++)
			array[i] = i + 1;
		
		// canvas settings
		int x_min=array[0]-1,x_max=array[array.length-1]+1;
		int y_min=0, y_max=array.length+3;
		StdDraw.setXscale(x_min, x_max);
		StdDraw.setYscale(y_min,y_max);
		
		// pen settings
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.setPenRadius(0.01);
		
		for(int i=0;i<array.length;i++) {
			int x=array[i]; // x == index of i-th element of array
			int y=linearSearch(x,array); // y==time of search
			System.out.println("x="+x+", y="+y);
			
			// draw graph points
			StdDraw.point(x, y);
		}
	}

	public static int linearSearch(int sk, int[] array) {
		// linear search
		int answer = -1;
		int counter = 0;
		for (int i = 0; i < array.length; ++i) {
			++counter;
			if (array[i] == sk) {
				answer = i;
			}
		}
		return counter;
	}
}
