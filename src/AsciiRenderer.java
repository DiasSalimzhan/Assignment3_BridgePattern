public class AsciiRenderer implements Renderer {
    @Override
    public String renderShape(String shapeName, double dimension) {
        return "ASCII " + shapeName.toLowerCase() + " char-size=" + dimension;
    }
}