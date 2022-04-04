package Lad2;

public class LineSearch {
    public static void main(String[] args) {
        int n = 10;
        int[] a = new int[n];
        //  for (int i = 0; i < a.length; i++) {
        //    a[i] = (int) (Math.random() * 100);
        for (int i = 0; i < a.length; i++)
            a[i] = i + 1;


        displayArr(a);
        // line search optimized 1
        // int x = 78;
        //  int count = 0;
        //  int answer = -1;
        //  for (i = 0; i < a.length; ++i) {
        //   count++;
        //   if (a[i] == x) {
        ////      answer = i;
        //  System.out.println("element was found" + x + "was found at index" + i);

        ////}
        //  }
        // int x = 5;
        //int count = 0;
        // int answer = -1;
        //  for (int i = 0; i < a.length; ++i) {
        // count++;
        //  if (a[i] == x) {
        //     answer = i;
        //  System.out.println("element was found" + x + "was found at index" + i);
        //   break;

        //  }
        // }
        int x = 5;
        int count = 0;
        int answer = -1;
        int last = a[a.length - 1];
        a[a.length - 1] = x;
        int i = 0;
        while ((a[i] != x))
            i++;
        count++;
        a[a.length - 1] = last;
        if (i < a.length - 1 || a[a.length - 1] == x) {
            System.out.println("element " + x + "was found at " + i + "index");
            answer = i;
        }
        System.out.println("answer" + " " + answer);
        System.out.println("some text" + " " + count );
    }


    public static void displayArr(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(" [" + i + ":" + a[i] + "]");
        System.out.println();
    }

}
