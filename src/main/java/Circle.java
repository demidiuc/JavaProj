/**
 * Created by Serg on 06.03.2016.
 */
import java.lang.Math;
public class Circle {
    int r;
    final double PI=3.14;

    Circle(int x) {
        r=x;
    }

    double circleA(){
        return PI*(r*r);
    }
}
