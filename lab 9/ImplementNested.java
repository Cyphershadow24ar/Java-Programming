class Outer {
    interface Inner {
        void show();
    }
}

class ImplementNested implements Outer.Inner {
    public void show() {
        System.out.println("Nested Interface Implemented!");
    }

    public static void main(String[] args) {
        Outer.Inner obj = new ImplementNested();
        obj.show();
    }
}
