package Classes;

public class Circle implements Comparable {
    private int radius;

    public Circle (int r) {
        radius = r;
    }

    @Override
    public int compareTo(Object o) {
        return radius - ((Circle) (o)).getRadius();
    }

    public int getRadius() {
        return radius;
    }
    
}
