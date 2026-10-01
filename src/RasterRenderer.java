public class RasterRenderer implements Renderer {
    @Override
    public String renderShape(String shapeName, double dimension) {
        return "RASTER " + shapeName.toLowerCase() + " pixels~" + (dimension * 10);
    }
}