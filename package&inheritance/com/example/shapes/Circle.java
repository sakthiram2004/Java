import java.util.*;

class Circle {
    double r, a;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius (r): ");
        r = sc.nextDouble();
    }

    void process() {
        a = Math.PI * r * r;
    }

    void output() {
        System.out.println("Area of the circle: " + a);
    }
}
