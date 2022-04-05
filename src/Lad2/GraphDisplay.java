package Lad2;

public class GraphDisplay {

	public static void main(String[] args) {
		int n = 100;
		int[] array = new int[n];
		for (int i = 0; i < n; i++)
			array[i] = i + 1;

		// canvas settings
		int x_min = array[0] - 1, x_max = array[array.length - 1] + 1;
		int y_min = 0, y_max = array.length + 3;
		StdDraw.setXscale(x_min, x_max);
		StdDraw.setYscale(y_min, y_max);

		// pen settings
		StdDraw.setPenRadius(0.01);

		for (int i = 0; i < array.length; i++) {
			int x = array[i]; // x == index of i-th element of array
			int y = linearSearch(x, array); // y==time of search
			System.out.println("x=" + x + ", y=" + y);

			// draw graph points
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.point(x, y);
		}

		for (int i = 0; i < array.length; i++) {
			int x = array[i]; // x == index of i-th element of array
			int y = linerSearchBetter(x, array); // y==time of search
			System.out.println("x=" + x + ", y=" + y);

			// draw graph points and color
			StdDraw.setPenColor(StdDraw.YELLOW);
			StdDraw.point(x, y);
		}

		for (int i = 0; i < array.length; i++) {
			int x = array[i]; // x == index of i-th element of array
			int y = LinerSearchBetter2(x,array); // y==time of search
			System.out.println("x=" + x + ", y=" + y);

			// draw graph points and color
			StdDraw.setPenColor(StdDraw.GREEN);
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

	public static int linerSearchBetter(int sk, int[] array) {
		int answer = -1;
		int counter = 0;
		for (int i = 0; i < array.length; ++i) {
			++counter;
			if (array[i] == sk) {
				answer = i;
				break;
			}
		}
		return counter;
	}

	public static int LinerSearchBetter2(int sk, int[] array){
		int[][] pointXY = new int[2][array.length];

		int counter = 0; // y=counter
		for (int i = 0; i < array.length; i++) {
			// linear search
			pointXY[0][i] = i; // xi=i
			 sk = array[i];
			int last = array[array.length - 1];
			array[array.length - 1] = sk;
			while (array[counter] != sk)
                counter++;
			array[array.length - 1] = last;

			if (counter < array.length - 1 || array[array.length - 1] == sk)
				System.out.println("element " + sk + " was found at index " + counter);
			else
				System.out.println("element " + sk + " was not found");

            System.out.println("Number of comparsionis is " + i);
			pointXY[1][i] = counter;
		}

		return counter;
	}
}
