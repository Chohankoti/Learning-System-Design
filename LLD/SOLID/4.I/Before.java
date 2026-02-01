interface Machine {
    void print();
    void scan();
    void fax();
}

class Printer implements Machine {
    public void print() {}

    public void scan() {
        throw new UnsupportedOperationException();
    }

    public void fax() {
        throw new UnsupportedOperationException();
    }
}
