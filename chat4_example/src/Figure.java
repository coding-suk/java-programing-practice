import java.util.Scanner;

public class Figure {
    Scanner sc = new Scanner(System.in);
    public Figure() {
        CircleApp pizza;
        pizza = new CircleApp();
        double area = pizza.getArea();
        pizza.radius = 10;
        pizza.name = "자바피자";
        area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        CircleApp donut = new CircleApp();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);

        Rectangle rect = new Rectangle();
        System.out.print("width, height >> ");
        rect.width = sc.nextInt();
        rect.height = sc.nextInt();
        System.out.println("사각형의 면적은 " + rect.getArea());

    }
    class CircleApp {
        int radius;
        String name;
        public CircleApp() { } // 이너클래스의 생성자
        public double getArea() {
            return 3.14*radius*radius;
        } //이너 클래스의 메서드
    } // 이너 클래스

    class Rectangle {
        int width, height;

        public int getArea() {
            return width*height;
        }
    }
}
