package SingleResp;

public class SingleResp {


    public static void main(String[] args) {
        
        Employee emp = new Employee("Nishant", "Kumar");

        System.out.println("This is single responsibility - geting and setting employee names" + emp.firstName + emp.lastName);

    }
}