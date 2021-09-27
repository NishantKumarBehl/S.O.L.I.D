package LiskovsubstitutionPrinciple;

// Principle states that the objects of superclass shall be replaceable with objects of
// its subclass without breaking the application

// Recommendation is not look for IS-A relationship but the question
// CAN A PARTICULAR TYPE BE SUBSTITUTED BY A PARTICULAR SUBTYPE

// Violations - How do you spot
// #1 Empty methods or Partially implemented interfaces that are not implementable in class that is extending base class
// e.g @Override public void fly(int alt){ throw exception or do nothing}
// #2 Harden preconditions
// e.g. square extending rectangle. square doesnt need width but just height
//      Rectangle r = new sqaure() , r.setWidth(10), r. setHeight(20),r.area() will give wrong answer
// #3 Type checking of class to implement certain behavior with forceful typecasting

// Problem Statement: You have an Account that supports deposit and widrawl, now you have a requiremet to support new type
// of account-FixedTermDeposit.. which obviously support only Deposit.. Implement the new feature in compliance to LSP

import LiskovsubstitutionPrinciple.AbstractClass.Account;
import LiskovsubstitutionPrinciple.Utils.FixedTermDeposit;

    public class SubstitutionPrinciple {
        public static void main(String[] args) {
            Account myFixedTermDepositAccount = new FixedTermDeposit();
            double amount = myFixedTermDepositAccount.deposit(10000.000);
            System.out.println(amount);
        }
}


