public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.a = 5.0;
        triangle.b = 6.0;
        triangle.c = 7.0;

        System.out.printf("Triangle : %.1f", triangle.area());
    }
}