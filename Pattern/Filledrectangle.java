public class Filledrectangle {
    public static void main(String[] args) {
        int width = 5;
        int height = 3;

        System.out.println("Filled Rectangle of width " + width + " and height " + height + ":");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
