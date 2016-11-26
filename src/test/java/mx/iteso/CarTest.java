package mx.iteso;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple Car.
 */
public class CarTest extends TestCase {

    Car car;

    @Before
    public void setUp(){
        car = new Car();

    }

    @Test
    public void testGetSn(){
        car.setSn("1000");
        assertEquals("1000", car.getSn());
    }

    @Test
    public void testGetBrand(){
        car.setBrand("Fiat");
        assertEquals("Fiat", car.getBrand());
    }


}
