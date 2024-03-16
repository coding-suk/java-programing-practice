public class Circle {
    int radius;
    String name;
    public Circle() {
        CircleAp pizza = new CircleAp(10, "자바피자"); // 생성자 호출

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        CircleAp donut = new CircleAp();
        donut.name = "도넛 피자";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    } // 생성자

    class CircleAp {
        int radius = 1;
        String name = "";

        public CircleAp() {
            radius = 1; name = "";
        }
        public CircleAp(int r, String n) {
            radius = r; name = n;
        }
        public double getArea() {
            return 3.14*radius*radius;
        }
    }


}
