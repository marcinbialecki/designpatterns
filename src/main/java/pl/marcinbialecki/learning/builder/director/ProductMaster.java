package pl.marcinbialecki.learning.builder.director;

import pl.marcinbialecki.learning.builder.IProductBuilder;
import pl.marcinbialecki.learning.builder.model.Product;

/**
 * Product Master (Director).
 */
public class ProductMaster {

    /**
     * ProductBuilder.
     */
    private IProductBuilder productBuilder;

    /**
     * Constructor.
     *
     * @param productBuilder Builder instance.
     */
    public ProductMaster(final IProductBuilder productBuilder) {
        this.productBuilder = productBuilder;
    }

    /**
     * Build product.
     *
     * @return Built product.
     */
    public Product getProduct() {
        this.productBuilder.addColor();
        this.productBuilder.setName();
        return this.productBuilder.build();
    }

}