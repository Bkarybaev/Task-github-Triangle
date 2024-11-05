public class Triangle {
    double a;
    double b;
    double c;

    public double area() {
        double res = (a + b + c) / 2;
        return Math.sqrt(res * (res - a) * (res - b) * (res - c));
    }
}
