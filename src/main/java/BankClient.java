import java.util.Scanner;

public class BankClient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ac = 1;
        double bal = 100.00;
        System.out.println("What is your preferred name?");
        String name = scan.nextLine();
        System.out.println(BankAccount.Name(name));
        System.out.println(BankAccount.accountNum(ac));
        String choose = scan.nextLine();
        System.out.println("type 1 to check balance, type 2 to deposit, type 3 to withdrawl: ");




//        // Create a bank account with the given name and the account number 101134
//        BankAccount account = new BankAccount(name, 101134);
    }
}
