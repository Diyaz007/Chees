public class Circle extends Figure{
    private double radius;
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String speak() {
        return "I am circle";
    }
}
