// 13 - april - 22
// program for application of concept Hybrid inheritance
// G-F---F---S&D;   S---G-S;    D

class GrandFather {

    String Gname, Gage, Gprofession;

    GrandFather(String Gn, String Ga, String Gp) {
        this.Gname = Gn;
        this.Gage = Ga;
        this.Gprofession = Gp;
    }
}

class Father extends GrandFather {
    String Fname, Fage, Fprofession;

    Father(String Gname, String Gage, String Gprofession, String Fname, String Fage,
            String Fprofession) {
        super(Gname, Gage, Gprofession);
        this.Fname = Fname;
        this.Fage = Fage;
        this.Fprofession = Fprofession;
    }
}

class Son extends Father {

    String Sname, Sage, Sprofession;

    Son(String Gname, String Gage, String Gprofession, String Fname, String Fage, String Fprofession, String Sname,
            String Sage, String Sprofession) {
        super(Gname, Gage, Gprofession, Fname, Fage, Fprofession);
        this.Sname = Sname;
        this.Sage = Sage;
        this.Sprofession = Sprofession;
    }

    void Display() {
        System.out.println("\nFamily Tree with each's Information :");

        System.out.println("\nGrand Father Information ----\n");
        System.out.println("Grand Father Name : " + Gname);
        System.out.println("Grand Father Age : " + Gage);
        System.out.println("Grand Father Profession : " + Gprofession);

        System.out.println("\nFather Information ----\n");
        System.out.println("Father Name : " + Fname);
        System.out.println("Father Age : " + Fage);
        System.out.println("Father Profession : " + Fprofession);

        System.out.println("\nSon Information ----\n");
        System.out.println("Son Name : " + Sname);
        System.out.println("Son  Age : " + Sage);
        System.out.println("Son  Profession : " + Sprofession);
    }
}

class Daughter extends Father {

    String Dname, Dage, Dprofession;

    Daughter(String Gname, String Gage, String Gprofession, String Fname, String Fage, String Fprofession, String Dname,
            String Dage, String Dprofession) {

        super(Gname, Gage, Gprofession, Dname, Dage, Dprofession);
        this.Dname = Dname;
        this.Dage = Dage;
        this.Dprofession = Dprofession;
    }

    void Display() {
        System.out.println("\nFamily Tree with each's Information :");

        System.out.println("\nGrand Father Information ----\n");
        System.out.println("Grand Father Name : " + Gname);
        System.out.println("Grand Father Age : " + Gage);
        System.out.println("Grand Father Profession : " + Gprofession);

        System.out.println("\nFather Information ----\n");
        System.out.println("Father Name : " + Fname);
        System.out.println("Father Age : " + Fage);
        System.out.println("Father Profession : " + Fprofession);

        System.out.println("\nDaughter Information ----\n");
        System.out.println("Daughter Name : " + Dname);
        System.out.println("Daughter  Age : " + Dage);
        System.out.println("Daughter  Profession : " + Dprofession);
    }

}

class GrandSon extends Son {

    String GSname, GSage, GSprofession;

    GrandSon(String Gname, String Gage, String Gprofession, String Fname, String Fage, String Fprofession, String Sname,
            String Sage, String Sprofession, String GSname,
            String GSage, String GSprofession) {

        super(Gname, Gage, Gprofession, Fname, Fage, Fprofession, Sname, Sage, Sprofession);
        this.GSname = GSname;
        this.GSage = GSage;
        this.GSprofession = GSprofession;
    }

    void Display() {
        System.out.println("\nFamily Tree with each's Information :");

        System.out.println("\nGrand Father Information ----\n");
        System.out.println("Grand Father Name : " + Gname);
        System.out.println("Grand Father Age : " + Gage);
        System.out.println("Grand Father Profession : " + Gprofession);

        System.out.println("\nFather Information ----\n");
        System.out.println("Father Name : " + Fname);
        System.out.println("Father Age : " + Fage);
        System.out.println("Father Profession : " + Fprofession);

        System.out.println("\nSon Information ----\n");
        System.out.println("Son Name : " + Sname);
        System.out.println("Son  Age : " + Sage);
        System.out.println("Son  Profession : " + Sprofession);

        System.out.println("\nGrand Son Information ----\n");
        System.out.println("Grand Son Name : " + GSname);
        System.out.println("Grand Son  Age : " + GSage);
        System.out.println("Grand Son  Profession : " + GSprofession);
    }
}

public class Hybrid_prog {
    public static void main(String[] args) {
        GrandSon gs = new GrandSon("Hemantrao Dhenge", "80", "Retired Bus Conductor", "Sushilrao Dhenge", "55",
                "Garage Owner", "Saurav Dhenge", "30", "Automobile Engineer", "Laxman Dhenge", "25",
                "Mechanical Engineer");

        gs.Display();
    }
}
