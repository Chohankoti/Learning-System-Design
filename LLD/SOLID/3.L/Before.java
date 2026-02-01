class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}

class Penguin extends Bird {
    public void fly() {
        throw new UnsupportedOperationException();
    }
}

class Sparrow extends Bird {
    public void fly() {
        System.out.println("Flying");
    }
}
