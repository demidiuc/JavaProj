import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Serg on 06.03.2016.
 */
public class CircleTest {
//    public static void main(String[] args) {
//        Circle t=new Circle(10);
//        System.out.println("Area should be 314,result is: "+t.circleA());
//    }


    //Below you can see how tests should be done
    @Test
    public void circleObjectTypeTest() {
        Circle c = new Circle(10);
        Assert.assertEquals(Circle.class, c.getClass()); //This is how we can check if type of created object is expected type
    }

    @Test
    public void circleAreaTest() {
        Circle c = new Circle(10);
        Assert.assertEquals(314, Math.round(c.circleA())); //This is how we can check if expected result and calculated result are identical
    }
}
