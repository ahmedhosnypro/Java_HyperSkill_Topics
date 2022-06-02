
class Box<T extends Animal> {
    T t;

    void add(T t) {
        this.t = t;
    }
}

class Animal {
}