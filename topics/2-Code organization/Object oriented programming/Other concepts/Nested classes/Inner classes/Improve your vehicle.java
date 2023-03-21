
class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    class Engine {

        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        void start() {
            System.out.println("RRRrrrrrrr....");
        }

        void printHorsePower() {
            System.out.println("Vehicle " + Vehicle.this.name + " has " + this.horsePower + " horsepower.");
        }
    }
}

class EnjoyVehicle {

    public static void main(String[] args) {
        int horsePower = 15;
        Vehicle vehicle = new Vehicle("Dixi");
        Vehicle.Engine engine = vehicle.new Engine(horsePower);
        engine.printHorsePower();
    }
}