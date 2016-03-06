/**
 * Created by Serg on 06.03.2016.
 */
public class Rectangle {
    int width;
    int height;

    Rectangle(int x, int y) {
        this.width=x;
        this.height=y;
    }

    int rectangleArea() {
        return width*height;
    }
}
