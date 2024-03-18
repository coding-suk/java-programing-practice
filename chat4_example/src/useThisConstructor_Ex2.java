public class useThisConstructor_Ex2 {
    public useThisConstructor_Ex2() {
        Car1 c1 = new Car1();
        Car1 c2 = new Car1(c1);

        System.out.println("c1의 color= " + c1.color + ", gearType= " + c1.gearType + ", door=" +c1.door);
        System.out.println("c2의 color= " + c2.color + ", gearType= " + c2.gearType + ", door=" +c2.door);

        c1.door = 100; // c1의 인스턴스 변수 door의 값을 변경
        System.out.println("c1.door = 100 수행 후");
        System.out.println("c1의 color= " + c1.color + ", gearType= " + c1.gearType + ", door=" +c1.door);
        System.out.println("c2의 color= " + c2.color + ", gearType= " + c2.gearType + ", door=" +c2.door);
    }

    class Car1 {
        String color;
        String gearType;
        int door;

        Car1() {
            this("white", "auto", 4);
        }
        Car1(Car1 c) {
            color = c.color;
            gearType = c.gearType;
            door = c.door;
        }
        Car1 (String color, String gearType, int door) {
            this.color = color;
            this.gearType = gearType;
            this.door = door;
        }
    }
}
