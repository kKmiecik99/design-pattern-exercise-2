package account;

import logger.LoggerService;

public class AccountService {
    private LoggerService log= LoggerService.getInstance();

    public void withdraw(String accountNumber, double amount) {
        if(amount>0 && AccountNumberValidator.validate(accountNumber)) {
            log.log(amount + " has been withdraw from " + accountNumber);
        }
    }

    public void deposit(String accountNumber, double amount) {
        if(amount>0 && AccountNumberValidator.validate(accountNumber)) {
            log.log(amount + " has been deposit into " + accountNumber);
        }
    }
}
