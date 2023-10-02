public class BoxRunner {
    public static void main(String[] args) {
        Box newBox = new Box(6, 10, 8);

        //double larger = newBox.anySideLongerThan(10); // A

        //boolean big = newBox.anySideLongerThan(7.5); // B

        boolean x = newBox.anySideLongerThan(5); // C

        //String dim = newBox.printDimensions(); // D

        //System.out.println(newBox.printDimensions()); // E

        newBox.printDimensions(); // F

        //double volume = newBox.volume(21.8); // G
    }
}
