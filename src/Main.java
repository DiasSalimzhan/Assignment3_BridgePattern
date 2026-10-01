public class Main {
    private static int passCount = 0;

    public static void main(String[] args) {
        runT1();
        runT2();
        runT3();
        runT4();
        runT5();
        runT6();
        runT7();
        System.out.println("SUMMARY: " + passCount + "/7 PASS");
    }

    private static void checkAndPrint(String testId, String setup, String expected, String actual) {
        boolean passed = expected.equals(actual);
        if (passed) passCount++;
        System.out.print(testId + " " + (passed ? "PASS" : "FAIL") + " | " + setup + " | result=" + actual);
        if (!passed) System.out.print(" | expected=" + expected);
        System.out.println();
    }

    private static void runT1() {
        Shape circle = new Circle("C1", new VectorRenderer());
        checkAndPrint("T1", "Circle + VectorRenderer", "VECTOR circle dimension=2.0", circle.execute());
    }

    private static void runT2() {
        Shape circle = new Circle("C2", new RasterRenderer());
        checkAndPrint("T2", "Circle + RasterRenderer", "RASTER circle pixels~20.0", circle.execute());
    }

    private static void runT3() {
        Shape square = new Square("S1", new VectorRenderer());
        checkAndPrint("T3", "Square + VectorRenderer", "VECTOR square dimension=3.0", square.execute());
    }

    private static void runT4() {
        Shape square = new Square("S2", new RasterRenderer());
        checkAndPrint("T4", "Square + RasterRenderer", "RASTER square pixels~30.0", square.execute());
    }

    private static void runT5() {
        Shape shape = new Circle("C3", new VectorRenderer());
        Shape originalReference = shape;
        double originalDimension = shape.getDimension();
        String originalId = shape.getId();

        String before = shape.execute();
        shape.setImplementation(new RasterRenderer());
        String after = shape.execute();

        boolean sameObject = (originalReference == shape);
        boolean stateUnchanged = (originalDimension == shape.getDimension() && originalId.equals(shape.getId()));

        boolean passed = sameObject && stateUnchanged &&
                before.equals("VECTOR circle dimension=2.0") &&
                after.equals("RASTER circle pixels~20.0");

        if (passed) passCount++;

        System.out.println("T5 " + (passed ? "PASS" : "FAIL") + " sameObject=" + sameObject + " | stateUnchanged=" + stateUnchanged);
        System.out.println("before=" + before + " | after=" + after);
    }

    private static void runT6() {
        Shape circle = new Circle("C4", new AsciiRenderer());
        checkAndPrint("T6", "Circle + AsciiRenderer", "ASCII circle char-size=2.0", circle.execute());
    }

    private static void runT7() {
        Shape square = new Square("S4", new AsciiRenderer());
        checkAndPrint("T7", "Square + AsciiRenderer", "ASCII square char-size=3.0", square.execute());
    }
}