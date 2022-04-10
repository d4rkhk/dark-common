package me.agxpt.dark.common.defaultImpl;

import me.agxpt.dark.common.types.IV2d;

/**
 * Default implementation of {@link IV2d}
 */
public class V2d implements IV2d {
    public double x, y;

    public V2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double x() {
        return x;
    }

    @Override
    public void x(double x) {
        this.x = x;
    }

    @Override
    public double y() {
        return y;
    }

    @Override
    public void y(double y) {
        this.y = y;
    }
}
