class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        int rows = twoDimArray.length;
        int cols = twoDimArray[0].length;

        int[][] output = new int[2][2];

        if (rows == 1 && cols == 1) {
            output[0][0] = twoDimArray[0][0];
            output[0][1] = twoDimArray[0][0];
            output[1][0] = twoDimArray[0][0];
            output[1][1] = twoDimArray[0][0];
        } else if (rows == 1) {
            output[0][0] = twoDimArray[0][0];
            output[0][1] = twoDimArray[0][cols - 1];
            output[1][0] = twoDimArray[0][0];
            output[1][1] = twoDimArray[0][cols - 1];
        } else if (cols == 1) {
            output[0][0] = twoDimArray[0][0];
            output[0][1] = twoDimArray[0][0];
            output[1][0] = twoDimArray[rows - 1][0];
            output[1][1] = twoDimArray[rows - 1][0];
        } else {
            output[0][0] = twoDimArray[0][0];
            output[0][1] = twoDimArray[0][cols - 1];
            output[1][0] = twoDimArray[rows - 1][0];
            output[1][1] = twoDimArray[rows - 1][cols - 1];
        }
        for (var row : output) {
            for (var col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}