// Module 1
// Code challenge 1

public class Area {

    public double areaRectangle(int length, int width)
    {
        return length * width;
    }

    public double areaTriangle(int base, int height)
    {
        return 0.5 * base * height;
    }

    public static void main(String[] args)
    {
        Area a1 = new Area();
        System.out.println("Rectange area is: " + a1.areaRectangle(6 , 4));
        System.out.println("Triangle area is: " + a1.areaTriangle(6 , 4));
    }
}