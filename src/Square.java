public class Square extends Shape {
    private double side;

    public Square(String id, Renderer renderer) {
        super(id, renderer);
        this.side = 3.0; // Assignment requirement
    }

    @Override
    public double getDimension() {
        return side;
    }

    @Override
    public String execute() {
        return renderer.renderShape("square", side);
    }
}