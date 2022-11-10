package Q_one;

import java.util.Scanner;

public class BasicAccount extends BankAccount {
    Scanner in=new Scanner ( System.in );
    BankAccount bank =new BankAccount ();

    public void Basic (){
        int x = in.nextInt ();
        if (x > super.getBalance ())
            System.out.println ("Sorry Your account balance is less than the number entered ");
        else
        System.out.println ("the balanc ="+super.getBalance ());


    }



}
