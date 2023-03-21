import java.util.Scanner;

interface  House {

    public default void chooseLocation() {
        System.out.println("Choose the best location for the new house");
    }

    public default void placeRoofs() {
        System.out.println("Place metal sheet roofs");
    }

    public default void connectElectricity() {
        System.out.println("Connect the house to the electrical grid");
    }

    public default void build() {
        chooseLocation();
        placeFoundations();
        placeWalls();
        placeWindows();
        placeDoors();
        placeRoofs();
        connectElectricity();
    }

    public abstract void placeFoundations();

    public abstract void placeWalls();

    public abstract void placeWindows();

    public abstract void placeDoors();
}

class Wooden implements House {
    @Override
    public void placeFoundations() {
        System.out.println("Place a wooden foundation");
    }

    @Override
    public void placeWalls() {
        System.out.println("Place wooden walls");
    }

    @Override
    public void placeWindows() {
        System.out.println("Place wooden windows");
    }

    @Override
    public void placeDoors() {
        System.out.println("Place wooden doors");
    }
}

class Stone implements House {

    @Override
    public void placeFoundations() {
        System.out.println("Place a stone foundation");
    }

    @Override
    public void placeWalls() {
        System.out.println("Place stone walls");
    }

    @Override
    public void placeWindows() {
        System.out.println("Place reinforced windows");
    }

    @Override
    public void placeDoors() {
        System.out.println("Place reinforced doors");
    }
}

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String type = scanner.nextLine();
        scanner.close();
        House house = null;
        if ("wooden".equalsIgnoreCase(type)) {
            house = new Wooden();
        } else if ("stone".equalsIgnoreCase(type)) {
            house = new Stone();
        } else {
            System.out.println("Error!");
            System.exit(0);
        }
        house.build();
    }
}