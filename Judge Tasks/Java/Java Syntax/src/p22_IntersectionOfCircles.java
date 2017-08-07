import java.util.Arrays;
import java.util.Scanner;

public class p22_IntersectionOfCircles {
    static class Circle {
        private Point Center;
        private double Radius;

        public Circle() {
        }

        public Circle(Point center, double radius) {
            Center = center;
            Radius = radius;
        }

        public Point getCenter() {
            return Center;
        }

        public void setCenter(Point center) {
            Center = center;
        }

        public double getRadius() {
            return Radius;
        }

        public void setRadius(double radius) {
            Radius = radius;
        }
    }
    static class Point {
        private int X;
        private int Y;

        public Point() {
        }

        public Point(int x, int y) {
            X = x;
            Y = y;
        }

        public int getX() {
            return X;
        }

        public void setX(int x) {
            X = x;
        }

        public int getY() {
            return Y;
        }

        public void setY(int y) {
            Y = y;
        }
    }
    public static void main(String[] args) {

        Circle circle1 = ReadCircle();
        Circle circle2 = ReadCircle();

        if(TheyIntersect(circle1, circle2))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
    private static Circle ReadCircle()
    {
        Scanner scanner = new Scanner(System.in);
        //int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String inpString = scanner.nextLine();
        String[] inpArr = inpString.split("\\s+");
        int[] input = new int[inpArr.length];
        for (int i = 0; i < inpArr.length; i++) {
            input[i] = Integer.parseInt(inpArr[i]);
        }

        Point center = new Point();
        center.setX(input[0]);
        center.setY(input[1]);
        Circle currCircle = new Circle();
        currCircle.setCenter(center);
        currCircle.setRadius(input[2]);
        return currCircle;
    }
    static Boolean TheyIntersect(Circle circle1, Circle circle2)
    {
        Boolean result = false;
        double distance = CalculateDistance(circle1.getCenter(), circle2.getCenter());
        if(distance <= (double)(circle1.getRadius() + circle2.getRadius()))
        {
            result = true;
        }
        return result;
    }

    private static double CalculateDistance(Point center1, Point center2)
    {
        double result;
        int sideA = Math.abs(center1.getX() - center2.getX());
        int sideB = Math.abs(center1.getY() - center2.getY());
        result = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        return result;
    }
}
