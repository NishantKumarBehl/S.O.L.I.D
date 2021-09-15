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


public class LiskvsubstitutionPrinciple {
        public static void main(String[] args) {

            Account myfixtermDeposit = new FixedTermDeposit();
            myfixtermDeposit.deposit(10000.000);
            
        }


        // Design abstracted Account class to only handle deposit and the widrawl method
        // shall be avaialbe in types of accounts(WidrawableAccount) that support widrawal along with deposit
        // With this Widrawal service only interacts with Widrawable account

        public abstract class Account{
            protected abstract void deposit( Double amount);
  
        }

        public abstract class WidrawableAccount{

            protected abstract void deposit( Double amount);

            protected abstract void widraw(Double amount);
    
        }

        public class WidrawlService {

            private WidrawableAccount account;

            public WidrawlService(WidrawableAccount account){
                this.account = account;
            }

            public void widraw(Double amount){
                account.widraw(amount);

            }
        }

        public class FixedTermDeposit extends Account{

            @Override
            public void deposit(Double amount){
                System.out.println("Amount deposit in FixedTermAccount");
            }

            
        }
}


