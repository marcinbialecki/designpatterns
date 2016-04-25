package pl.marcinbialecki.learning.builder.model;

/**
 * Product class.
 */
public class Product {

    /**
     * Product color.
     */
    private Color color;

    /**
     * Product namel.
     */
    private String name;

    public void setColor(final Color color) {
        this.color = color;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}