package LiskovsubstitutionPrinciple;

import LiskovsubstitutionPrinciple.AbstractClass.Account;
import LiskovsubstitutionPrinciple.Utils.FixedTermDeposit;

    public class SubstitutionPrinciple {
        public static void main(String[] args) {
            Account myFixedTermDepositAccount = new FixedTermDeposit();
            double amount = myFixedTermDepositAccount.deposit(10000.000);
            System.out.println(amount);
        }
}


