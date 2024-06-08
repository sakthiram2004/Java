package packageandingeritance.circle.cylinder;

import packageandingeritance.circle.Circle;
import java.util.Scanner;

public class Cylinder extends Circle {
    private double h, v;

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Enter height (h): ");
        h = sc.nextDouble();
    }

    @Override
    public void process() {
        super.process();
        v = a * h;
    }

    @Override
    public void output() {
        System.out.println("Volume of the cylinder: " + v);
    }
}
