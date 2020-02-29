package account;

import logger.LoggerService;

public class TransferService {
    private LoggerService log= LoggerService.getInstance();
    public void transfer(final String accountNumberSource,final String accountNumberDestination, double ammount) {
        if(ammount>0 && AccountNumberValidator.validate(accountNumberSource)
                && AccountNumberValidator.validate(accountNumberDestination)) {
            log.log("money from " + accountNumberSource + " to " + accountNumberDestination + " has been transferred ...");

        }
    }
}
