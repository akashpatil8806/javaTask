class TestFinalVariable {
    final int MAX_VALUE = 100;

    void display() {
        MAX_VALUE = 200; // This will cause a compilation error
        System.out.println("MAX_VALUE: " + MAX_VALUE);
    }

    public static void main(String[] args) {
        TestFinalVariable obj = new TestFinalVariable();
        obj.display();
    }
}
