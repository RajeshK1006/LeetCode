class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) { // Try all 4 rotations (0°, 90°, 180°, 270°)
            if (areMatricesEqual(mat, target)) {
                return true;
            }
            rotate90(mat); // Rotate 90° clockwise
        }
        return false;
    }

    private void rotate90(int[][] mat) {
        int n = mat.length;
        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // Correct transposition
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        // Step 2: Reverse each row
        for (int[] row : mat) {
            reverse(row);
        }
    }

    private void reverse(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    private boolean areMatricesEqual(int[][] mat1, int[][] mat2) {
        int n = mat1.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat1[i][j] != mat2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
