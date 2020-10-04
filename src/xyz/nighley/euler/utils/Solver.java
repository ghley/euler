package xyz.nighley.euler.utils;

import xyz.nighley.euler.p0.p011_020.P011;
import xyz.nighley.euler.p0.p011_020.P012;
import xyz.nighley.euler.p0.p011_020.P013;
import xyz.nighley.euler.p0.p011_020.P014;

public class Solver {
    public Solver(Class<? extends Problem> clazz) {
        try {
            System.out.println(clazz.getConstructor().newInstance().getResult());
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Solver(P014.class);
    }
}
