public class ObjectDrawer {
    public static void main(String[] args) {
        drawFilledSquare(6,4);
        System.out.println();
        System.out.print("----------------------- ");
        System.out.println();
        drawEmptySquare(6,4);
        System.out.println();
        System.out.print("----------------------- ");
        System.out.println();
        drawTriangle90Degree(8,5);
        System.out.println();
        System.out.print("----------------------- ");
        System.out.println();
        drawTriangleEqualEdges(19);


    }
    public static void drawFilledSquare(int edge1,int edge2) {
        for (int i = 0; i < edge1; i++) {
            for (int j = 0; j < edge2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void  drawEmptySquare(int edge1,int edge2) {
        for (int i = 0; i < edge1; i++) {
            for (int j = 0; j < edge2; j++) {
                if (i == 0 || i == edge1 - 1 || j == 0 || j == edge2 - 1) {
                    System.out.print("* "); // Kare kenarlarına yıldız basar
                } else {
                    System.out.print("  "); // Kare içini boş bırakır
                }
            }
            System.out.println(); // Her satırın sonunda yeni satıra geçiyoruz
        }
    }

    public static void  drawTriangle90Degree(int edge1,int edge2) {
        for (int i = 0; i < edge1; i++) {
            for (int j = 0; j <=i; j++) {
                    System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void  drawTriangleEqualEdges(int distance) {
        for (int i = 0; i <= distance/2; i++) {
            for (int j = 0; j < distance; j++) {
                if (j >= (distance/2)-i && j <= (distance/2)+i ) {
                    System.out.print("* "); // Kare kenarlarına yıldız basar
                } else {
                    System.out.print("  "); // Kare içini boş bırakır
                }
            }
            System.out.println(); // Her satırın sonunda yeni satıra geçiyoruz
        }
    }
    }
