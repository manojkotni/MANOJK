package flightmanagement;

public class BankAccount{
	
	public static void withdraw(double withdamt, double balance) {
		// TODO Auto-generated method stub
		
		if(withdamt <= balance && withdamt > 20000) {
			System.out.println("Withdraw done Successfully");
			balance=balance-withdamt;

			}else if( withdamt < 0) 
			{
				throw new InvalidEntryException("InvalidEntry Fund RuntimeException");
				
			}else if (withdamt > balance && withdamt > 20000) 
			{
				throw new InsufficientFundsException("Insufficient Fund RuntimeException");
				
			}else if(withdamt < 20000) {
				throw new WithdrawLimitException("WithdrawLimitException RuntimeException");
			}
			//return balance;
	}

}

class InvalidEntryException extends RuntimeException {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidEntryException(String message) {
    super(message);
}
}

class InsufficientFundsException extends RuntimeException {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InsufficientFundsException(String message) {
    super(message);
}
}

class WithdrawLimitException extends RuntimeException {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public WithdrawLimitException(String message) {
    super(message);
}
}