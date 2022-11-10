package Q_one;

public class BankAccount {

        private double balance;

        public BankAccount(){
            balance = 0;
        }


        public BankAccount ( double balance ) {
            this.balance = balance;

        }

        public void deposint( double amount ){
            balance+=amount;
        }
        public void withdraw( double amount){
            balance-=amount;
        }
        public double getBalance(){
            return balance;
        }
    }






