package me.agxpt.dark.common.defaultImpl;

import me.agxpt.dark.common.types.IColor;

/**
 * Default implementation of {@link IColor}
 */
public class Color implements IColor {
    public double r, g, b, a;

    public Color(double r, double g, double b, double a) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
    }

    @Override
    public double r() {
        return r;
    }

    @Override
    public void r(double r) {
        this.r = r;
    }

    @Override
    public double g() {
        return g;
    }

    @Override
    public void g(double g) {
        this.g = g;
    }

    @Override
    public double b() {
        return b;
    }

    @Override
    public void b(double b) {
        this.b = b;
    }

    @Override
    public double a() {
        return a;
    }

    @Override
    public void a(double a) {
        this.a = a;
    }

    @Override
    public int toARGB() {
        return ((int) (a * 255) << 24)
                + ((int) (r * 255) << 16)
                + ((int) (g * 255) << 8)
                + (int) (b * 255);
    }
}
