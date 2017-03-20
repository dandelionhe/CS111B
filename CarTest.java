public class CarTest {

    public static void main(String[] args) {
        Car car = new Car("Ford","Avart",1995);
        System.out.println(car.getMake);
        System.out.println(car.getModel);
        System.out.println(car.getYear);
        System.out.println(car.toString);
    }
}
