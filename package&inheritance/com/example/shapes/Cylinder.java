import java.util.*;

class Cylinder extends Circle {
    double h, v;

    void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Enter height (h): ");
        h = sc.nextDouble();
    }

    void process() {
        super.process();
        v = a * h;
    }

    void output() {
        System.out.println("Volume of the cylinder: " + v);
    }
}
