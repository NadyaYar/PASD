public class DisplayGraph2 {

	public static void main(String[] args) {
		int n = 100;

		int[] array = new int[n];
		for (int i = 0; i < n; i++)
			array[i] = i + 1;

		int[][] pointXY = new int[2][n]; // xi=pointXY[0][i] , yi=pointXY[1][i]
		// x | y
		// 0 | 1
		// 1 | 2
		// 2 | 3
		// ..| ..
		// n | ..

		for (int i = 0; i < array.length; i++) {
			// linear search
			pointXY[0][i]=i; // xi=i
			int sk =array[i]; 
			int counter = 0; // y=counter
			for (int j = 0; j < array.length; ++j) {
				++counter;
				if (array[j] == sk) {
					System.out.println("element " + sk + " was found ");
				}
			}
			// y(x)=counter
			pointXY[1][i]=counter;
		}
		
		// finding min/max values for XY scale
		int x_min=Integer.MAX_VALUE,
				x_max=Integer.MIN_VALUE,
				y_min=Integer.MAX_VALUE,
				y_max=Integer.MIN_VALUE;
		
		for(int i=0;i<pointXY[0].length;i++) {
			int xi=pointXY[0][i];
			int yi=pointXY[1][i];
			System.out.println(xi+" | "+yi); 
			
			if(x_min>xi)
				x_min=xi;
			if(y_min>yi)
				y_min=yi;
			
			if(x_max<xi)
				x_max=xi;
			if(y_max<yi)
				y_max=yi;
		}
		System.out.println(x_min+":"+x_max);
		System.out.println(y_min+":"+y_max);
		
		// setting canvas setting
		StdDraw.setXscale(x_min-1, x_max+1);
		StdDraw.setYscale(0, y_max+1);
		
		// setting color and size of point
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.setPenRadius(0.01);
		
		// draw all points
		for(int i=0;i<pointXY[0].length;i++) {
			StdDraw.point(pointXY[0][i], pointXY[1][i]); 
			
		}
	}
}
