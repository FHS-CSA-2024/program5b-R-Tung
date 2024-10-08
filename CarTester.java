public class CarTester{
    public static Car addCar(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the car's name: ");
        String name = scanner.nextLine();
        
        System.out.println("Please enter cars miles: ");
        double miles = scanner.nextDouble();
        
        System.out.println("Please enter cars gallons: ");
        double gallons = scanner.nextDouble();
        
        return new Car(name, miles, gallons);
    }
    public static void main (String[] args){
        Car car1 = addCar();
        System.out.println(car1.toString());
        System.out.println("------NEXT CAR-------------------------------------------");
        Car car2 = addCar();
        System.out.println(car2.toString());
    }
}
