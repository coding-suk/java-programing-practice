public class twoConstructors {
    int radius;
    String name;
    public twoConstructors() {
        Circle pizza = new Circle(10, "자바피자");

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut = new Circle();
        donut.name = "도넛 피자";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    } // 생성자

    public twoConstructors() {
        radius = 1;
        name = "";
    }

}
