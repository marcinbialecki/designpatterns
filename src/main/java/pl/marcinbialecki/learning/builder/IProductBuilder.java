package pl.marcinbialecki.learning.builder;

import pl.marcinbialecki.learning.builder.model.Product;

/**
 * Builder interface.
 */
public interface IProductBuilder {

    /**
     * Add new color to product.
     */
    void addColor();

    /**
     * Return ready product.
     * @return Instance of ready product.
     */
    Product build();
}