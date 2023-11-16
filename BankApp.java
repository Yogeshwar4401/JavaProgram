public class BankApp {
	
	private String name;
	private String bank;
	private long accno;
	private double balance;
	private String ifsc;
	private String branch;
	private String type;
	private int pin;
	
	public String getName()
	{
		return name;
	}
	public String getBank()
	{
		return bank;
	}
	
	public long getAccno()
	{
		return accno;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public String getIfsc()
	{
		return ifsc;
	}
	
	public String getBranch()
	{
		return branch;
	}
	
	public String getType()
	{
		return type;
	}
	
	public double getBalance(long accno , int pin)
	{
		if (accno==this.accno && pin==this.pin ) {
			return balance;
			
		}
		System.out.println("incoorect Crentials");
		return 0;
	}
	
	public void withdraw(long accno , int pin , double amount)
	{
		if (accno==this.accno && pin== this.pin) 
		{
		System.out.println("Login Sucess !");
		if (amount>0 && (balance-amount)>=2000)
		{
			balance-=amount;
			System.out.println("Amount Debited");
			System.out.println(getBalance(accno , pin));
		}
		else 
		{
			System.out.println("Isufficient Balance");
		}
		}
		else 
		{
			System.out.println("Incorrect Credentials");
		}
	}
	
	public void setPin(long accno,int pin,int newpin) 
	{
		if (accno==this.accno && pin==this.pin)
		{
			pin=newpin;
		  System.out.println("Pin Updated");	
		}
		else
		{
			System.out.println("Incoorect Pin Or Account Number");
		}
		
	}
	public BankApp(String name,String bank,long accno,double balance,String ifsc,String branch,String type,int pin )
	{
	this.name=name;
	this.bank=bank;
	this.accno=accno;
	this.balance=balance;
	this.ifsc=ifsc;
	this.branch=branch;
	this.type=type;
	this.pin=pin;
	System.out.println("Account Is Created !");
	}
	
	

	public static void main(String[] args) {
		BankApp B1=new BankApp("Yogesh","Sbi",123456789,50000.00,"SBI123456","Nanded","Saving Account",1234);
		
      System.out.println(B1.getBalance(123456789,1234));
      
    // System.out.println(B1.withdraw(123456789,1234,10000.00));
       B1.withdraw(123456789,1234,5000);
       
       B1.setPin(123456789,1234,7894);
       
	}

}