
public class BankAccount {
	double actual_amount=10000;
	public void deposit(double amount)
	{
		System.out.println("the Actual Amount:"+actual_amount);
		
	        actual_amount=actual_amount+amount;
	        System.out.println("The Money is successfully Deposited...."+amount);
	        System.out.println("the Money in your account after Deposited:"+actual_amount);

	}
	public void withDraw(int amount)
	{
		System.out.println("The Amount to be withdraw:"+amount);
		if(actual_amount<0)
		{
			actual_amount=actual_amount-amount;
			System.out.println("The Amount in Your account after withdraw is"+actual_amount);
		}
		else
		{
			System.out.println("There is no Sufficient Amount in your account to withdraw");
		}
	}
	public void checkBalance()
	{
		System.out.println("The Amount in your account is"+ actual_amount);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankAccount b= new BankAccount();
b.deposit(500);
b.withDraw(20000);
b.checkBalance();
	}

}
