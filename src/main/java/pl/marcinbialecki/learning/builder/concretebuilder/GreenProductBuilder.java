package pl.marcinbialecki.learning.builder.concretebuilder;

import pl.marcinbialecki.learning.builder.IProductBuilder;
import pl.marcinbialecki.learning.builder.model.Color;
import pl.marcinbialecki.learning.builder.model.Product;

/**
 * Green product builder.
 */
public class GreenProductBuilder implements IProductBuilder {

    /**
     * Product.
     */
    private Product product;

    /**
     * Constructor.
     */
    public GreenProductBuilder() {
        this.product = new Product();
    }

    public void addColor() {
        this.product.setColor(Color.GREEN);
    }

    public void setName() {
        this.product.setName("GreenProduct");
    }

    public Product build() {
        return product;
    }
}