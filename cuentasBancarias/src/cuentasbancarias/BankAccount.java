package cuentasBancarias;

public class BankAccount {

	  protected float balance;
	  protected int accountNumber;
	  protected char accountType;

	  private static int lastAccountNumber = 0;
	  private static float minBalance=0;
	  
	  // class methods
	  
	  public static void setMinBalance(float newMinBalance) {
		  minBalance=newMinBalance;
	  }

	  public static int newAccountNumber() {
		  return lastAccountNumber++;
	  }
	  
	  static public float getMinBalance()	{
		  return minBalance;
	  }
	  
	  public BankAccount(float initialBalance)      {
	    if(initialBalance >= minBalance) {
	    	balance = initialBalance;
		    accountNumber = newAccountNumber() + 1;
		    accountType=' ';
	    } else System.out.println("Not enough initialAmount");

	  }

	  // instance methods
	  public void deposit(float depositAmount)    {
	    balance += depositAmount;
	  }

	  public boolean withdraw(float withdrawAmount)   {
	    if (withdrawAmount > balance - getMinBalance()){
	      if (withdrawAmount > balance)
	    	  System.out.println("Balance not enough to maintain minimal balance");
	      else
	    	  System.out.println("Insufficient Funds!!!");
	      return false;
	    } else {
	      balance -= withdrawAmount;
	      return true;
	    }
	  }

	  public int getNumber()          {
	    return accountNumber;
	  }

	  public float getBalance()      {
	    return balance;
	  }
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}