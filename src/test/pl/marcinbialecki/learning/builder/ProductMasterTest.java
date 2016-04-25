package pl.marcinbialecki.learning.builder;

import org.junit.Assert;
import org.junit.Test;
import pl.marcinbialecki.learning.builder.concretebuilder.GreenProductBuilder;
import pl.marcinbialecki.learning.builder.concretebuilder.YellowProductBuilder;
import pl.marcinbialecki.learning.builder.director.ProductMaster;
import pl.marcinbialecki.learning.builder.model.Color;
import pl.marcinbialecki.learning.builder.model.Product;

/**
 * Test of builder pattern.
 */
public class ProductMasterTest {

    @Test
    public void testYellowProductShouldHasYellowColor() {
        // given
        ProductMaster productMaster  = new ProductMaster(new YellowProductBuilder());

        // when
        Product product = productMaster.getProduct();

        //thebn
        Assert.assertNotNull(product);
        Assert.assertEquals(product.getColor(), Color.YELLOW);
    }

    @Test
    public void testGreenProductShouldHasGreenColor() {
        // given
        ProductMaster productMaster  = new ProductMaster(new GreenProductBuilder());

        // when
        Product product = productMaster.getProduct();

        //thebn
        Assert.assertNotNull(product);
        Assert.assertEquals(product.getColor(), Color.GREEN);
    }

}
