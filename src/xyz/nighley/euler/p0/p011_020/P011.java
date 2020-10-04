package xyz.nighley.euler.p0.p011_020;

import xyz.nighley.euler.utils.Problem;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class P011 extends Problem {

    @Override
    public Object getResult() {
        int[][] arr = getData();
        long v1 = maxValueShift(arr, 1, 0);
        long v2 = maxValueShift(arr, 0, 1);
        long v3 = maxValueShift(arr, 1, 1);
        long v4 = maxValueShift(arr, -1, 1);
        return Math.max(v1, Math.max(v2, Math.max(v3, v4)));
    }

    public static long maxValueShift(int[][] arr, int x, int y) {
        long[][] newArr = new long[arr.length+4][arr.length+4];
        for (int q = 0; q < newArr.length; q++) {
            for (int r = 0; r < newArr[q].length; r++) {
                newArr[q][r] = 1;
            }
        }
        for (int s = 0; s < 4; s++) {
            for (int q = 0; q < arr.length; q++) {
                for (int r = 0; r < arr[q].length; r++) {
                    if (x < 0) {
                        newArr[q + 3 + x * s][r + y * s] *= arr[q][r];
                    }else {
                        newArr[q + x * s][r + y * s] *= arr[q][r];
                    }
                }
            }
            System.out.println(Arrays.toString(newArr[0]));
        }
        return Arrays.stream(newArr).flatMapToLong(d->Arrays.stream(d)).max().getAsLong();
    }



    public static int[][] getData() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("resources/p011/data.txt"));
            int rows = lines.size();
            int columns = lines.get(0).split(" ").length;
            int[][] arr = new int[columns][rows];
            for (int q = 0; q < rows; q++) {
                String[] split = lines.get(q).split(" ");
                for (int r = 0; r < columns; r++) {
                    arr[q][r] = Integer.parseInt(split[r]);
                }
            }
            return arr;
        }catch (Throwable t) {
            t.printStackTrace();
        }
        throw new RuntimeException("FAILED");
    }
}

