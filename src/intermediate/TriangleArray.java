package intermediate;

import static core.MyCore.toastln;

public class TriangleArray {

    public static void main(String[] args) {

        int[][] triangle = new int[10][];

        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];
        }
        for (int[] triangle1 : triangle) {
            for (int j = 0; j < triangle1.length; j++) {
                System.out.print(triangle1[j]);
            }
            toastln();
        }

    }
}
