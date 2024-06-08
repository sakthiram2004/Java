package packageandingeritance.circle;

import java.util.Scanner;

public class Circle {
    protected double r, a; 

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius (r): ");
        r = sc.nextDouble();
    }

    public void process() {
        a = Math.PI * r * r;
    }

    public void output() {
        System.out.println("Area of the circle: " + a);
    }
}
