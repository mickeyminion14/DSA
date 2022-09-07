
public class Solution {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        if (arr.length == 0 || arr[0].length == 0) {
            // return new int[0];
        }

        int m = arr.length;
        int n = arr[0].length;
        int[] result = new int[m * n];

        int i = 0;

        int col = 0;
        int row = 0;

        boolean up = true;

        while (row < m && col < n) {
            // System.out.println("came");
            if (up) {
                while (row > 0 && col < n - 1) {
                    result[i++] = arr[row][col];

                    col++;
                    row--;
                }

                if (col == n - 1) {
                    row++;
                } else {
                    col++;
                }

            }

            else {
                while (col > 0 && row < m - 1) {
                    result[i++] = arr[row][col];

                    row++;
                    col--;
                }

                if (row == m - 1) {
                    col++;
                } else {
                    row++;
                }
            }
            up = !up;
        }

        display(result);

    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
