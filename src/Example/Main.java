package Example;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
//        printArr(arr);
        int[][] matrixA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        short[][][] matrixB = {
                {{(short)1, (short)2}, {(short)3, (short)4}},
                {{(short)5, (short)6}, {(short)7, (short)8}},
        };
        int[][][][] matrix = {
                {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}},
                {{{9, 10}, {11, 12}}, {{13, 14}, {15, 16}}}
        };
        PrintArr.deepPrint(matrix);
    }
    // Можно попробовать шаблоны
}
