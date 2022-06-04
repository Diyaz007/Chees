public class Figure {
    private String color;
    private boolean visible;
    private LocationOfFigure locationOfFigure;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isVisible() {
        return visible;
    }
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    public LocationOfFigure getLocationOfFigure() {
        return locationOfFigure;
    }
    public void setLocationOfFigure(LocationOfFigure locationOfFigure) {
        this.locationOfFigure = locationOfFigure;
    }
    public String speak() {
        return "I am figure";
    }
}
