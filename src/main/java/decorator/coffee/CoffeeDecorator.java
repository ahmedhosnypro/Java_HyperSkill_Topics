package decorator.coffee;

import java.util.Locale;

class TestDrive {
    public static void main(String[] args) throws InterruptedException {
        final  int sleep = 1500;

        Coffee simpleEspresso = new Espresso();
        System.out.println(simpleEspresso.getDescription() + " $" + formatSum(simpleEspresso.getCOST()));

        Coffee espressoWithDecor = new Espresso();
        espressoWithDecor = new Milk(espressoWithDecor);
        espressoWithDecor = new Sugar(espressoWithDecor);
        System.out.println(espressoWithDecor.getDescription() + " $" + formatSum(espressoWithDecor.getCOST()));

        Coffee instantWithDecor = new InstantCoffee();
        instantWithDecor = new Whip(instantWithDecor);
        instantWithDecor = new Sugar(instantWithDecor);
        instantWithDecor = new Sugar(instantWithDecor);
        instantWithDecor = new Sugar(instantWithDecor);
        System.out.println(instantWithDecor.getDescription() + " $" + formatSum(instantWithDecor.getCOST()));

        System.out.println("I'm drinking my " + instantWithDecor.getDescription());
        Thread.sleep(sleep);
        System.out.println("-I want to add some Whipped Cream to my coffee. And don't make a new one! Just add Whipped Cream");
        Thread.sleep(sleep);
        System.out.println("-Okay! But the final price will change");
        Thread.sleep(sleep);
        System.out.println("-I understand");

        instantWithDecor = new Whip(instantWithDecor);
        System.out.println(instantWithDecor.getDescription() + " $" + formatSum(instantWithDecor.getCOST()));
    }

    private static String formatSum(double sum) {
        return String.format(Locale.ROOT, "%.2f", sum);
    }
}

abstract class Coffee {
    String description;

    String getDescription() {
        return description;
    }

    abstract double getCOST();
}

class Espresso extends Coffee {

    private static final double COST = 1.99;

    Espresso() {
        super();
        description = "Espresso";
    }

    @Override
    double getCOST() {
        return COST;
    }
}

class InstantCoffee extends Coffee {
    private static final double COST = 1.0;

    InstantCoffee() {
        super();
        description = "Instant Coffee";
    }

    @Override
    double getCOST() {
        return COST;
    }
}

abstract class Decorator extends Coffee {
    @Override
    abstract String getDescription();
}

class Milk extends Decorator {
    private static final double EXTRA_COST = 0.13;
    private final Coffee coffee;

    public Milk(Coffee coffee) {
        super();
        description = coffee.getDescription();
        this.coffee = coffee;
    }

    @Override
    String getDescription() {
        return this.coffee.getDescription() + ", Milk";
    }

    @Override
    double getCOST() {
        return EXTRA_COST + coffee.getCOST();
    }
}

class Sugar extends Decorator {
    private static final double EXTRA_COST = 0.02;
    private final Coffee coffee;

    public Sugar(Coffee coffee) {
        super();
        description = coffee.getDescription();
        this.coffee = coffee;
    }

    @Override
    String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    double getCOST() {
        return EXTRA_COST + coffee.getCOST();
    }
}

class Whip extends Decorator {
    private static final double EXTRA_COST = 0.1;
    private final Coffee coffee;

    public Whip(Coffee coffee) {
        super();
        description = coffee.getDescription();
        this.coffee = coffee;
    }

    @Override
    String getDescription() {
        return coffee.getDescription() + ", Whipped Cream";
    }

    @Override
    double getCOST() {
        return EXTRA_COST + coffee.getCOST();
    }
}