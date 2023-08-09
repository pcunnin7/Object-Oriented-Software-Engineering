class BankAccount {

    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private enum AccountType {
        SAVINGS,CHECKING
    }
    private AccountType at;
    //Creates bank account with the int var accountNumber, String var accountHolderName
    //double balance, an enum type AccountType, and an AccountType var to save the enum AccountType
    //to the object. This was not directly stated in the assignment intructions, but I did not know 
    //how to complete the assignment without it.


    public BankAccount(int aN, String aH, double b, String at) {
        this.accountNumber = aN;
        this.accountHolderName = aH;
        this.balance = b;
        if (at == "SAVINGS") {this.at = AccountType.SAVINGS;}
        else {this.at = AccountType.CHECKING;}
        //Constructor that takes int, string, double, and AccountType variables and assigns 
        //them to the object's accountNumber, accountHolderName, balance, and at variables 
        //in the case of the AccountType variable, it takes in a string variable and sets the object's
        //at to the meaning of the string with an if/else statement, assuming that if it is not "SAVINGS", 
        //it is "CHECKING"
    }

    public double deposit (double amount) {
        this.balance = this.balance + amount;
        return this.balance;
        //takes double amount, adds amount to balance and saves it 
    }

    public String withdraw (double amount) {
        if (this.balance < amount) {return "Insufficient Balance";}
        else {this.balance = this.balance - amount; return null;}
        //takes double amount and checks if it is more than the present balance. If so, 
        //returns string "Insufficient Balance". The assignment states to return it, not print it
        //so I went with returning it. If amount is less than current balance, it removes that 
        //amount from balance.
    }

    public String getAccountInfo() {
        String type = "SAVINGS";
        if (this.at == AccountType.CHECKING) {type = "CHECKING";}
        return(String.format("Account Number: %2d, Account Holder: %s, Account Type : %s, Balance: %f", 
        this.accountNumber, this.accountHolderName, type, this.balance));
        //creates a string variable and defaults it to "SAVINGS". If the AccountType enum is CHECKING, it changes 
        //the type variable to reflect that. It then returns a string formatted with all the object variables
    }

    public String transfer(BankAccount destinationAccount, int amount) {
        if (this.balance < amount) {return "Insufficient Funds";}
        else {
            this.balance = this.balance - amount;
            destinationAccount.balance = destinationAccount.balance + amount;
            return(String.format("%f", this.balance));
        }
        //first, checks if there are available funds for the transfer. Then takes amount from this bank accounts
        //balance, then adds the amount to destinationAccount, and returns the balance of the first account as a string
    }
}
    class BankAccountTest {
        
        public static void main (String[] args) {
            BankAccount mybank = new BankAccount (12345, "John Doe", 1000, "SAVINGS"); 
            mybank.deposit(500);
            mybank.withdraw(300.00);
            System.out.println(mybank.getAccountInfo());
            BankAccount dest = new BankAccount(54321, "John Doe", 2500, "CHECKING");
            System.out.println(mybank.transfer(dest, 700));
       //the main function creates mybank BankAccount object, deposits 500, withdraws 300, then prints the return of 
       //the getAccountInfo. It then creates a new BankAccount dest and transfers 700 from mybank to dest
    }
}