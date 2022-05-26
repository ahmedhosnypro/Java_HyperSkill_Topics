package decorator;

class TestDrive {
    public static void main(String[] args) {
        Bread bagel = new Bagel();

        bagel = new Butter(bagel);
        bagel = new Butter(bagel);
        bagel = new Ham(bagel);
        bagel = new Cheese(bagel);

        System.out.println(bagel);

        Bread bun = new Bun();
        bun = new Butter(bun);
        bun = new Jam(bun);
        bun = new Jam(bun);

        System.out.println(bun);
    }
}

class Bread {
    String description;
    int kcal;

    String getDescription() {
        return description;
    }

    int getKcal() {
        return kcal;
    }

    @Override
    public String toString() {
        return getDescription() + ". kCal: " + getKcal();
    }
}

class Bagel extends Bread {

    Bagel() {
        super();
        description = "decorator.Bagel";
        kcal = 250;
    }
}

class Bun extends Bread {

    Bun() {
        super();
        description = "decorator.Bun";
        kcal = 150;
    }
}

abstract class Decorator extends Bread {
    @Override
    abstract String getDescription();

    @Override
    abstract int getKcal();
}

class Butter extends Decorator {
    private final Bread bread;

    Butter(Bread bread) {
        super();
        this.bread = bread;
    }

    @Override
    String getDescription() {
        return bread.getDescription() + ", decorator.Butter";
    }

    @Override
    int getKcal() {
        return bread.getKcal() + 50;
    }
}

class Jam extends Decorator {

    private final Bread bread;

    Jam(Bread bread) {
        super();
        this.bread = bread;
    }

    @Override
    String getDescription() {
        return bread.getDescription() + ", decorator.Jam";
    }

    @Override
    int getKcal() {
        return bread.getKcal() + 120;
    }
}

class Cheese extends Decorator {

    private final Bread bread;

    Cheese(Bread bread) {
        super();
        this.bread = bread;
    }

    @Override
    String getDescription() {
        return bread.getDescription() + ", decorator.Cheese";
    }

    @Override
    int getKcal() {
        return bread.getKcal() + 40;
    }
}

class Ham extends Decorator {

    private final Bread bread;

    Ham(Bread bread) {
        super();
        this.bread = bread;
    }

    @Override
    String getDescription() {
        return bread.getDescription() + ", decorator.Ham";
    }

    @Override
    int getKcal() {
        return bread.getKcal() + 2500;
    }
}