package OpenClosedPrincipleWithStrategyPattern;

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
    // Step 2: Create another class that implements Inlt. money tranfer feature
    // Step 3: 

    public static void main(String[] args) {

         

    }

}
