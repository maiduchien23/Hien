package accountpkg;

public class TestAccount {

    public static void main(String[] args) {


        Account objAccount1 = new Account();

        System.out.println("Account Number:" + objAccount1.accountNumber);
        System.out.println("Acount Holder Name:" + objAccount1.accountHolderName);
        System.out.println("Account Type: " + objAccount1.accountType);
        System.out.println("Balance: " + objAccount1.balance);


        Account objAccount2 = new Account("Acc001","Jonh smith","Savings", 6500.789);

        System.out.println("Account Number:" + objAccount2.accountNumber);
        System.out.println("Acount Holder Name:" + objAccount2.accountHolderName);
        System.out.println("Account Type: " + objAccount2.accountType);
        System.out.println("Balance: " + objAccount2.balance);
    }
}
