package me.agxpt.dark.common.defaultImpl;

import me.agxpt.dark.common.types.IRectData;

/**
 * Default implementation of {@link IRectData}
 */
public class RectData<T> implements IRectData<T> {
    T tr, tl, br, bl;

    public RectData(T tr, T tl, T br, T bl) {
        this.tr = tr;
        this.tl = tl;
        this.br = br;
        this.bl = bl;
    }

    @Override
    public T tr() {
        return tr;
    }

    @Override
    public void tr(T data) {
        tr = data;
    }

    @Override
    public T tl() {
        return tl;
    }

    @Override
    public void tl(T data) {
        tl = data;
    }

    @Override
    public T br() {
        return br;
    }

    @Override
    public void br(T data) {
        br = data;
    }

    @Override
    public T bl() {
        return bl;
    }

    @Override
    public void bl(T data) {
        bl = data;
    }
}
