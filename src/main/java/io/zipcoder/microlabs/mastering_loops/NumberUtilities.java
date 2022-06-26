package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String ans = "";
        for( int i = start; i < stop; i++){
            if (i % 2 == 0){
                ans += i;

            }
        }

        return ans;
    }


    public static String getOddNumbers(int start, int stop) {
        String ans = "";
        for( int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                ans += i;
            }
        }
                return ans;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String ans = "";
        for( int i = start; i < stop; i++) {

                ans += i * i;
            }


                return ans;
    }

    public static String getRange(int start) {
        String ans = "";

                return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        String ans = "";
        for( int i = start; i < stop; i+=step) {

                ans += i;

        }

        return ans;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder ans = new StringBuilder();
        for( int i = start; i < stop; i += step) {

            ans.append((int) Math.pow(i,exponent));
        }

        return ans.toString();
    }
}
