package accountpkg;

public class Account {

    String accountNumber;
    String accountHolderName;
    String accountType;

    double balance;

        public Account(){
            System.out.println("Default Constructor Invoked..");
            accountNumber = "Not Specified";
            accountHolderName = "Not Specified";
            accountType = "Not Specified";
            balance = 0.0;
        }

        public Account(String accNo, String name, String accType, double bal){
            System.out.println("Parameterized Contructor Invoked");
            accountNumber = accNo;
            accountHolderName = name;
            accountType = accType;
            balance = bal;
        }

    }

