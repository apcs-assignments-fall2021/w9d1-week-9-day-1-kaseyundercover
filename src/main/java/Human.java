public class Human {
    private int ages;
    private String name;
    private double height;
    private double weight;
    private int ssn;
    private String job;
    private String gender;


    public Human(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }

    public void gender(String gender){
        this.gender = gender;
        System.out.println("Gender: " + gender);

    }

    public void age(int x) {
        ages = x;
        System.out.println("Age: " + x);
    }

    public void lbs(double x) {
        weight = x;
        System.out.println("Weight: " + x+ " lbs");
    }

    public void heightinches(double x) {
        height = x;
        System.out.println("Height (inches): " + x);
    }

    public void Aftermeal() {
        weight = weight + 0.1;
        System.out.println("Weight After Meal: " + weight + " lbs");
    }

    public void Ageintwodecades() {
        ages = ages + 20;
        System.out.println("Age in 20 Years: " + ages);
    }

    public void social() {
        ssn = (int) (Math.random() * 1000000000) + 1000000000;
        System.out.println("Social Security Number: " + ssn);
    }

    public void job(String occupation) {
        this.job = occupation;
        System.out.println("Job: " + job);}

     public void heightinayear(){
         height = height + (Math.random()*0.1)+1;
            System.out.println("Height (inches) in one year: " + height);
        }

    public void setJob(String futurejob) {
        this.job = futurejob;
        System.out.println("Future job: " + job);
    }
}