class Add {
    void add() {
        int a = 10;
        int b = 10;
        int c = a + b;
        System.out.println("the addtion of two number is:" + c);
    }
}

    class Sub extends Add {
        void Sub1() {
            int a = 10;
            int b = 10;
            int c = a - b;
            System.out.println("the addtion of two number is:" + c);
        }
    }

    class Multi extends Sub {
        void Mul() {
            int a = 10;
            int b = 10;
            int c = a *b;
            System.out.println("the addtion of two number is:" + c);
        }
    }

    class part {
        public static void main(String[] args) {
            // we need to create the two object
            Multi obj= new Multi();
            obj.add();
            obj.Sub1();
            obj.Mul();

        }
    }


