class Army {

    public static void createArmy() {
        // Create all objects here
        Unit n1 = new Unit("1");
        Unit n2 = new Unit("2");
        Unit n3 = new Unit("3");
        Unit n4 = new Unit("4");
        Unit n5 = new Unit("5");

        Knight k1 = new Knight("kn1");
        Knight k2 = new Knight("kn2");
        Knight k3 = new Knight("kn3");

        General general = new General("G1");

        Doctor doctor = new Doctor("Doc");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}