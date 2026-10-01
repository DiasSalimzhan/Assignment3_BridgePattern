public class Circle extends Shape {
    private double radius;

    public Circle(String id, Renderer renderer) {
        super(id, renderer);
        this.radius = 2.0; // Assignment requirement
    }

    @Override
    public double getDimension() {
        return radius;
    }

    @Override
    public String execute() {
        return renderer.renderShape("circle", radius);
    }
}
