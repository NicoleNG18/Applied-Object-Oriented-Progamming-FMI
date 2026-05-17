package com;

import services.Computable;

public class Tabulate {
    private Computable callback;

    public Tabulate(Computable callback) {
        this.callback = callback;
    }

    public Computable getCallback() {
        return callback;
    }

    public void setCallback(Computable callback) {
        this.callback = callback;
    }

    public void tabulate(double a, double b, int steps) {
        tabulateFunction(a, b, steps, callback);
    }

    public static void tabulateFunction(
            double a,
            double b,
            int steps,
            Computable computable) {
        if (b < a) {
            System.out.println("a must be smaller than b.");
            return;
        }

        if (steps <= 0) {
            System.out.println("steps must be above zero.");
            return;
        }

        if (computable == null) {
            System.out.println("computable must not be null.");
            return;
        }

        double step = (b - a) / steps;

        System.out.printf("%-10s%-10s%n", "X", "F(X)");

        for (double x = a; x <= b; x += step) {
            System.out.printf("%-10.2f%-10.2f%n", x, computable.function(x));
        }
    }
}
