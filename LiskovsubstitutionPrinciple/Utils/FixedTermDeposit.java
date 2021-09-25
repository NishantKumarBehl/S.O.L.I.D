package LiskovsubstitutionPrinciple.Utils;

import LiskovsubstitutionPrinciple.AbstractClass.Account;

public class FixedTermDeposit extends Account {
    @Override
    public double deposit(Double amount) {
        System.out.println("Amount deposit in FixedTermAccount");

        return amount;
    }
}
