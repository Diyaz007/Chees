public class Rectangle extends Figure{
    public static int counter = 0;
    private int height;
    private int width;
    public Rectangle() {
        counter++;
    }
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        counter++;
    }
    public Rectangle(int x) {
        this.height = x;
        this.width = x;
        counter++;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    @Override
    public String speak() {
        if (this.width == this.height) {
            return "I am square";
        }
        return "I am rectangle";
    }
}
