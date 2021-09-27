package LiskovsubstitutionPrinciple.AbstractClass;

        // Design abstracted Account class to only handle deposit 
        // widrawl method shall be availalbe in types of accounts(WidrawableAccount) that support widrawal along with deposit
        // With this Widrawal service only interacts with Widrawable account

public abstract class Account {
    public abstract double deposit(Double amount);
}
