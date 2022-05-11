package me.agxpt.dark.common.types;

public interface IColor {
    /**
     * Get the red channel of the color.
     *
     * @return The red channel of the color.
     */
    double r();

    /**
     * Set the red channel of the color.
     *
     * @param r Red value to set.
     */
    void r(double r);

    /**
     * Get the green channel of the color.
     *
     * @return The green channel of the color.
     */
    double g();

    /**
     * Set the green channel of the color.
     *
     * @param g Green value to set.
     */
    void g(double g);

    /**
     * Get the blue channel of the color.
     *
     * @return The blue channel of the color.
     */
    double b();

    /**
     * Set the blue channel of the color.
     *
     * @param b Blue value to set.
     */
    void b(double b);

    /**
     * Get the alpha channel of the color.
     *
     * @return The alpha channel of the color.
     */
    double a();

    /**
     * Set the alpha channel of the color.
     *
     * @param a Alpha value to set.
     */
    void a(double a);

    /**
     * Get the color as ARGB 0-255 int.
     *
     * @return The color as ARGB 0-255 int.
     */
    int toARGB();
}
