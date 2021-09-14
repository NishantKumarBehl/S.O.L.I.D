package OpenClosedPrincipleWithStrategyPattern;

import javax.management.RuntimeErrorException;

public class OpenClosedP {
    // Open for Extension and Closed for modification
    // you do this by abstracting an interface that can be passed as parameter
    // in a constructor of a class that implments the interface
    // this class is called context class that when called with instance of  
    // concrete classes abstracts the implementation of 
    // enabling the concrete class implementing its own behaviour
    // that is why it implements behaviour design pattern called STRATEGY
    // since it also abstracts away the interface, creational design pattern
    // Abstract factory is a plus for OCP and makes the classes open for extension but closed for mods


    // I am going to take an example of BankAccount that has a method Money Transfer
    // At Start BankAccount has only local money tranfer method so there is no problem
    // But when new requirement comes in to have a different procedure to handle
    // International money transfer functionality we need to ensure that there is no
    // need to modify our Concrete \base class BankAccount bcz if you do then you
    // are in violcation of OCP. so lets see how do you hand it step by Step

    // Step 1: lets have a class Bank account that has a method money transfer
    // Step 2: Create another class for Intl Bank account and implements Inlt. money tranfer feature 
    //         which means we now need to support two different types of transfer
    // Step 3: Abstract the money transfer functionality into an interface as
    //         the implementation of international and local tranfers will differ
    //         abstracting method into interface will remove the need to modify the 
    //         BaseClass BankAccount to support international transfer while adding
    //         International bank account feature
    // Step 4: 
    public enum TransferType {LOCAL, INTL};

    public static void main(String[] args) {

         TransferType type = TransferType.INTL;
         double amount = 1000000;
        
         MoneyTransferI transfer = MoneyTranferProcessorFactory.build(type);

         

         processMoneyTransfer(amount,  type);


    }

    // Both BankAccount and Intl Bank Account
    public class BankAccount implements MoneyTransferI{

            public void transferMoney(double amount){

                
                System.out.println("LOCAL Transfer Your money is successfully transferred");
            }
    }

    public class IntlBankAccount implements MoneyTransferI{

        public void transferMoney(double amount){
            System.out.println("INTL Transfer Your money is successfully transferred");
        }

}

    //Abstracting the money transfer method\functionality into a Interface-STRATEGY
    public interface  MoneyTransferI{

        public void transferMoney(double amount);

    }

    public static class MoneyTranferProcessorFactory {

        public static MoneyTransferI build(TransferType type){

            if (type == TransferType.INTL){
                return new IntlBankAccount();
            } 
            
            else if(type == TransferType.LOCAL){
                return new BankAccount();
            
            throw new RuntimeException("Please provide the valid Transfer Type")

            }
        }

        public void processMoneyTransfer(double amount, TransferType type){

            MoneyTranferProcessorFactory factory = new MoneyTranferProcessorFactory();
            MoneyTransferI mtt = factory.build(type);
            mtt.transferMoney(amount);
        }
    }



}
