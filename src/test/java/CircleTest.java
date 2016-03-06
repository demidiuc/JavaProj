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


    //Below you can see how test should be done
    @Test
    public void circleAreaTest() {
        Circle c = new Circle(10);
        Assert.assertEquals(314, Math.round(c.circleA()));
    }
}
