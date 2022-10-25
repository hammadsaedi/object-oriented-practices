package Lab_Tasks.Lab_5.Task_5;

import java.util.Objects;
import Lab_Tasks.Lab_1.Task_4.Rectangle;
import Lab_Tasks.Lab_1.Task_7.Circle;

public class GeometricCollection {
    private Circle circles[] = new Circle[10];
    private Rectangle rectangles[] = new Rectangle[10];
    
    public GeometricCollection(){
        this(new Circle[]{new Circle(0)}, new Rectangle[]{new Rectangle(0, 0)});
    }

    public GeometricCollection(GeometricCollection obj) {
        this(obj.circles, obj.rectangles);
    }

    public GeometricCollection(Circle[] circles, Rectangle[] rectangles) {
        if (Objects.nonNull(circles)) {
            for(int i = 0; i < Math.min(this.circles.length, circles.length); i++){
                this.circles[i] = circles[i];
            }
        }
        if (Objects.nonNull(rectangles)) {
            for(int i = 0; i < Math.min(this.rectangles.length, rectangles.length); i++){
                this.rectangles[i] = rectangles[i];
            }
        }
    }

    double area(){
        double area = 0;
        for (int i = 0; i < circles.length; i++){
            if (Objects.nonNull(circles[i])) area += (Math.PI * Math.pow(circles[i].getRadius(), 2));
        }

        for (int i = 0; i < rectangles.length; i++){
            if (Objects.nonNull(rectangles[i])) area += rectangles[i].area();
        }

        return area;
    }
    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("GeometricCollection [Circles: ");
        for (int i = 0; i < circles.length; i++) {
            if (Objects.nonNull(circles[i]))
                buffer.append(circles[i] + " , ");
        }
        buffer.append("] , ");

        for (int i = 0; i < rectangles.length; i++) {
            if (Objects.nonNull(rectangles[i]))
                buffer.append(rectangles[i] + " , ");
        }
        buffer.append("]");
        return buffer.toString();
    }
}
