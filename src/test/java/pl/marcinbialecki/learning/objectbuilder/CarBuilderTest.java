package pl.marcinbialecki.learning.objectbuilder;

import org.junit.Assert;
import org.junit.Test;
import pl.marcinbialecki.learning.builder.model.Color;

/**
 * Car builder test.
 */
public class CarBuilderTest {

    @Test
    public void tetsBuild() {
        // given
        Car car = new Car.Builder(2016).setColor(Color.GREEN).setModel("Ford").setSeats(5).build();

        // then
        Assert.assertNotNull(car);
        Assert.assertEquals(car.getColor(), Color.GREEN);
        Assert.assertEquals(car.getYearofProduction(), 2016);
        Assert.assertEquals(car.getModel(), "Ford");
        Assert.assertEquals(car.getSeats(), 5);
    }

}