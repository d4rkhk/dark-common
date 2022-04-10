package me.agxpt.dark.common.defaultImpl;

import me.agxpt.dark.common.types.IV3d;

/**
 * Default implementation of {@link IV3d}
 */
public class V3d implements IV3d {
    public double x, y, z;

    public V3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    @Override
    public double z() {
        return z;
    }

    @Override
    public void z(double z) {
        this.z = z;
    }
}
