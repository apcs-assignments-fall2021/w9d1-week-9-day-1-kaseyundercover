public class HumanClient {
    public static void main(String[] args) {
    Human y = new Human("Bob");
    String gender = "Male";
    String futurejob = "Painter";
    y.gender(gender);
    y.age(13);
    y.lbs(130.5);
    y.heightinches(75.5);
    y.job("Student");
    y.Aftermeal();
    y.Ageintwodecades();
    y.social();
    y.heightinayear();
    y.setJob(futurejob);
    System.out.println("\n");
    Human z = new Human("Joe");
    futurejob = "Business Owner";
    z.gender(gender);
    z.age(2);
    z.lbs(13.0);
    z.heightinches(12);
    z.job("Unemployed");
    z.Aftermeal();
    z.Ageintwodecades();
    z.social();
    z.heightinayear();
    z.setJob(futurejob);

    }
}
