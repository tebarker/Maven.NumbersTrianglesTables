package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int tableSize = 5;
        return getMultiplicationTable(tableSize);

    }

    public static String getLargeMultiplicationTable() {
        int tableSize = 10;
        return getMultiplicationTable(tableSize);

    }

    public static String getMultiplicationTable(int tableSize) {

        StringBuilder output = new StringBuilder();
        for(int width = 1; width <= tableSize; width++) {
            for(int height = 1; height <= tableSize; height++) {
                output.append(String.format("%3d", width * height));
                output.append(" |");
            }
            output.append("\n");
        }
        String table = output.toString();
        return table;

    }
}
