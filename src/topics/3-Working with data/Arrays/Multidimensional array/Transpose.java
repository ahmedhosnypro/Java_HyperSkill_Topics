class TransposeRectArray {
    private static int[][] transpose(int[][] array) {
        // empty or unset array, nothing do to here
        if (array == null || array.length == 0)
            return array;

        int width = array.length;
        int height = array[0].length;

        int[][] array_new = new int[height][width];

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                array_new[y][x] = array[x][y];
            }
        }
        return array_new;
    }
}