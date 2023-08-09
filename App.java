public class App {
    public static void main(String[] args) throws Exception {
        Car mySedan= CarFactory.create("sedan");
        Car mySport = CarFactory.create("sport");
        mySedan.topSpeed();
        mySport.topSpeed();
        Car turbo = new TurboEngine(CarFactory.create("sedan"));
    }
}
