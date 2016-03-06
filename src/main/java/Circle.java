/**
 * Created by Serg on 06.03.2016.
 */
import java.lang.Math;
public class Circle {
    int r;
//    final double PI=3.14; //Try to use internal formulas, libraries, methods, etc..

    Circle(int x) {
        r=x;
    }

    double circleA(){
        return Math.PI*(r*r);
    }
}
