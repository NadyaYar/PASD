package Lab3.lab4;

public class TestingLoneLoop {
    public static void main(String[] args) {

        long[] N = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 3000, 5000,
                7000, 10000 };


        long[] expResults = testForLoops(N);

//     long[] expResults = testingForDoubleLoop(N);

        //   long[] expResults = testingForLoopsWithVariableLimits(N);
//
//  long[] expResults = testingForLoopsWithVariableLimits2(N);
//
   // long[] expResults = testingForLoopsWithConstantInternal(N);
//
//      long[] expResults = testingForLoopsWithVariablesInternal(N);

        long minN = 0, maxN = N[N.length - 1];
        long minT = 0, maxT = expResults[expResults.length - 1];

        int marg = 3;
        minN = minN - (long) (maxN * marg / 100.0);
        maxN = maxN + (long) (maxN * marg / 100.0);
        minT = minT - (long) (maxT * marg / 100.0);
        maxT = maxT + (long) (maxT * marg / 100.0);

        StdDraw.setXscale(minN, maxN);
        StdDraw.setYscale(minT, maxT);
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(255, 87, 51);

        System.out.println("N\ttime,ms");

        for (int i = 0; i < expResults.length; i++) {
            StdDraw.point(N[i], expResults[i]);
            System.out.println(N[i] + ", " + expResults[i]);
        }
    }

    private static long[] testForLoops(long[] N) {
        long[] expResults = new long[N.length];

        for (int expCounter = 0; expCounter < expResults.length; expCounter++) {
            StopWatch timer = new StopWatch();
            timer.start();

            boolean result;
            int a, b;

            for (int i = 0; i < N[expCounter]; i++) {
                a = (int) (Math.random() * 10);
                b = (int) (Math.random() * 10);
                if (a == b)
                    result = true;
                else
                    result = false;
            }
            timer.stop();
            expResults[expCounter] = timer.getTime();
        }
        return expResults;
    }

    private static long[] testingForDoubleLoop(long[] N) {
        long[] expResults = new long[N.length];

        for (int expCounter = 0; expCounter < expResults.length; expCounter++) {
            StopWatch timer = new StopWatch();
            timer.start();

            boolean result;
            int a, b;

            for (int i = 0; i < N[expCounter]; i++) {
                for (int j = 0; j < N[expCounter]; j++) {
                    a = (int) (Math.random() * 10);
                    b = (int) (Math.random() * 10);
                    if (a == b)
                        result = true;
                    else
                        result = false;
                }
            }
            timer.stop();
            expResults[expCounter] = timer.getTime();
        }
        return expResults;
    }

    private static long[] testingForLoopsWithVariableLimits(long[] N) {
        long[] expResults = new long[N.length];

        for (int expCounter = 0; expCounter < expResults.length; expCounter++) {
            StopWatch timer = new StopWatch();
            timer.start();

            boolean result;
            int a, b;

            for (int i = N.length; i > 0; i = i / 2) {
                a = (int) (Math.random() * 10);
                b = (int) (Math.random() * 10);
                if (a == b)
                    result = true;
                else
                    result = false;
            }
            timer.stop();
            expResults[expCounter] = timer.getTime();
        }
        return expResults;
    }

    private static long[] testingForLoopsWithVariableLimits2(long[] N) {
        long[] expResults = new long[N.length];

        for (int expCounter = 0; expCounter < expResults.length; expCounter++) {
            StopWatch timer = new StopWatch();
            timer.start();

            boolean result;
            int a, b;

            for (int i = 1; i <= N[expCounter]; i = i * 2) {
                a = (int) (Math.random() * 10);
                b = (int) (Math.random() * 10);
                if (a == b)
                    result = true;
                else
                    result = false;
            }
            timer.stop();
            expResults[expCounter] = timer.getTime();
        }
        return expResults;
    }

    private static long[] testingForLoopsWithConstantInternal(long[] N) {
        long[] expResults = new long[N.length];

        for (int expCounter = 0; expCounter < expResults.length; expCounter++) {
            StopWatch timer = new StopWatch();
            timer.start();

            boolean result;
            int a, b;

            for (int i = 0; i < N[expCounter]; i++) {
                for (int j = 0; j < 1000; j++) {
                    a = (int) (Math.random() * 10);
                    b = (int) (Math.random() * 10);
                    if (a == b)
                        result = true;
                    else
                        result = false;
                }
            }
            timer.stop();
            expResults[expCounter] = timer.getTime();
        }
        return expResults;
    }

    private static long[] testingForLoopsWithVariablesInternal(long[] N) {
        long[] expResults = new long[N.length];

        for (int expCounter = 0; expCounter < expResults.length; expCounter++) {
            StopWatch timer = new StopWatch();
            timer.start();

            boolean result;
            int a, b;

            for (int i = 0; i < N[expCounter]; i++) {
                for (int j = 0; j < i; j++) {
                    a = (int) (Math.random() * 10);
                    b = (int) (Math.random() * 10);
                    if (a == b)
                        result = true;
                    else
                        result = false;
                }
            }
            timer.stop();
            expResults[expCounter] = timer.getTime();
        }
        return expResults;
    }


}

