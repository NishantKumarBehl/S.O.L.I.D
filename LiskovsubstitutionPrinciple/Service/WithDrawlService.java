package LiskovsubstitutionPrinciple.Service;

import LiskovsubstitutionPrinciple.AbstractClass.WithDrawableAccount;

public class WithDrawlService {
    private WithDrawableAccount account;

    public WithDrawlService(WithDrawableAccount account){
        this.account = account;
    }

    public void WithDraw(Double amount){
        account.withDraw(amount);

    }
}
