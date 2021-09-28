package InterfaceSeggregationWithAdapterPattern;

public interface Loan extends Payment{

    void initiateRepayment();
    void initiateLoanSettlement();
}

