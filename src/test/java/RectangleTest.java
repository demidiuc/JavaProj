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
    public void rectangleAreaTest() {
        Rectangle r = new Rectangle(10, 50);

        Assert.assertEquals(500, r.rectangleArea());
    }
}
