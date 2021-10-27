public class BankAccount {
    // Instance variables
    private double balance;
    private int accountNumber;
    private double withdrawl;
    private int deposit;
    private String preferredName;

    public BankAccount(double b, int d, double w, int ac, String pn) {
        ac = accountNumber;
        b = balance;
        pn = preferredName;
        w = withdrawl;
        d = deposit;
    }

    public static String Name(String name) {
        return ("Hi " + name + "!");
    }

    public static String accountNum(int ac) {
        int number = (int) (((ac * Math.random() * 1000)));
        return ("Your account number is " + number);}

    public static double balance(double bal){
        return bal;
        }

//    public static double With(double bal){
//        //double withdrawl=bal-amount;
//        return null;

}