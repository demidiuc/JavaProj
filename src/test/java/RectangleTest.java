import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Serg on 06.03.2016.
 */
public class RectangleTest {
//    public static void main(String[] args) {
//        Rectangle t = new Rectangle(10, 50);
//        System.out.println("Area should be 500, and result is: "+t.rectangleArea());
//
//    }

    @Test
    public void rectangleObjectTypeTest() {
        Rectangle r = new Rectangle(1, 1);
        Assert.assertEquals(Rectangle.class, r.getClass()); //This is how we can check if type of created object is expected type
    }

    @Test
    public void rectangleAreaTest() {
        Rectangle r = new Rectangle(10, 50);
        Assert.assertEquals(500, r.rectangleArea()); //This is how we can check if expected result and calculated result are identical
        //TODO: Try to change expected value and see how test result is affected
    }
}
