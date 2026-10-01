public class VectorRenderer implements Renderer {
    @Override
    public String renderShape(String shapeName, double dimension) {
        return "VECTOR " + shapeName.toLowerCase() + " dimension=" + dimension;
    }
}