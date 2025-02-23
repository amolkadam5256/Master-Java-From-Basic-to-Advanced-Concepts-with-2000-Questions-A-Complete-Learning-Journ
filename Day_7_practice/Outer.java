class Outer {
    int x = 10;

    class Inner {
        int x = 20;

        void show() {
            System.out.println("Inner class x: " + x);
            System.out.println("Outer class x: " + Outer.this.x); // Refers to outer class variable
            System.out.println("Inner class x: " + this.x); // Refers to Inner class variable
        }

        void don() {
            System.out.println(" Don Inner class x: " + this.x);
            System.out.println(" Don Inner class x: " + x);
            System.out.println(" Don Outer class x: " + Outer.this.x);
        }
    }

    public static void main(String[] args) {
        Outer.Inner obj = new Outer().new Inner();
        obj.show();
        obj.don();
    }
}
