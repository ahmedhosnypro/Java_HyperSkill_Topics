package decorator.pizza;

import java.util.Locale;

class TestDrive {
    public static void main(String[] args) {
        Pizza simpleVeganPizza = new Vegan();
        System.out.println(simpleVeganPizza.getDescription() + " $" + formatSum(simpleVeganPizza.getCost()));

        Pizza veganPizzaDecor = new Vegan();
        veganPizzaDecor = new Broccoli(veganPizzaDecor);
        veganPizzaDecor = new Tomato(veganPizzaDecor);
        veganPizzaDecor = new Spinach(veganPizzaDecor);
        System.out.println(veganPizzaDecor.getDescription() + " $" + formatSum(veganPizzaDecor.getCost()));

        Pizza meatPizzaDecor = new MeatHeaven();
        meatPizzaDecor = new Ham(meatPizzaDecor);
        meatPizzaDecor = new Chicken(meatPizzaDecor);
        meatPizzaDecor = new Cheese(meatPizzaDecor);
        System.out.println(meatPizzaDecor.getDescription() + " $" + formatSum(meatPizzaDecor.getCost()));

    }

    private static String formatSum(double sum) {
        return String.format(Locale.ROOT, "%.2f", sum);
    }
}

abstract class Pizza {
    String description;

    String getDescription() {
        return description;
    }

    abstract double getCost();
}

class Vegan extends Pizza {
    private static final double COST = 4.99;

    Vegan() {
        super();
        description = "Vegan";
    }

    @Override
    double getCost() {
        return COST;
    }
}

class MeatHeaven extends Pizza {
    private static final double COST = 4.0;

    MeatHeaven() {
        super();
        description = "MeatHeaven";
    }

    @Override
    double getCost() {
        return COST;
    }
}

abstract class Decorator extends Pizza {
    @Override
    abstract String getDescription();
}

class Ham extends Decorator {
    private static final double EXTRA_COST = 1.0;
    private final Pizza pizza;

    Ham(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Ham";
    }

    @Override
    double getCost() {
        return EXTRA_COST + pizza.getCost();
    }
}

class Chicken extends Decorator {
    private static final double EXTRA_COST = 1.5;
    private final Pizza pizza;

    Chicken(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Chicken";
    }

    @Override
    double getCost() {
        return EXTRA_COST + pizza.getCost();
    }
}

class Cheese extends Decorator {
    private static final double EXTRA_COST = 0.2;
    private final Pizza pizza;

    Cheese(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    double getCost() {
        return EXTRA_COST + pizza.getCost();
    }
}

class Broccoli extends Decorator {
    private static final double EXTRA_COST = 0.1;
    private final Pizza pizza;

    Broccoli(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Broccoli";
    }

    @Override
    double getCost() {
        return EXTRA_COST + pizza.getCost();
    }
}

class Tomato extends Decorator {
    private static final double EXTRA_COST = 0.09;
    private final Pizza pizza;

    Tomato(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Tomato";
    }

    @Override
    double getCost() {
        return EXTRA_COST + pizza.getCost();
    }
}

class Spinach extends Decorator {
    private static final double EXTRA_COST = 0.09;
    private final Pizza pizza;

    Spinach(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Spinach";
    }

    @Override
    double getCost() {
        return EXTRA_COST + pizza.getCost();
    }
}
