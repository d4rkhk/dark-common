package me.agxpt.dark.common.types;

public interface IRectData<T> {
    /**
     * Get the top-right corner of the rect.
     *
     * @return The corner data.
     */
    T tr();

    /**
     * Set the top-right corner of the rect.
     *
     * @param data The corner data.
     */
    void tr(T data);

    /**
     * Get the top-left corner of the rect.
     *
     * @return The corner data.
     */
    T tl();

    /**
     * Set the top-left corner of the rect.
     *
     * @param data The corner data.
     */
    void tl(T data);

    /**
     * Get the bottom-right corner of the rect.
     *
     * @return The corner data.
     */
    T br();

    /**
     * Set the bottom-right corner of the rect.
     *
     * @param data The corner data.
     */
    void br(T data);

    /**
     * Get the bottom-left corner of the rect.
     *
     * @return The corner data.
     */
    T bl();

    /**
     * Set the bottom-left corner of the rect.
     *
     * @param data The corner data.
     */
    void bl(T data);
}
