import java.util.Date;
public class account {
	private int id;
	private double balance;
	private double annualInterestRate ;
	private Date dateCreated;
	
	public account(){
		this.id=0;
		this.balance=0;
		this.annualInterestRate=0;
	}
	public account(int id, double balance ){
		this.id=id;
		this.balance=balance;
		this.dateCreated= new Date();
	}
	public int getId() {
       return id;
   }
   public void setId(int id) {
       this.id = id;
   }
   public double getBalance() {
       return balance;
   }
   public void setBalance(double balance) {
       this.balance = balance;
   }
   public double getAnnualInterestRate() {
       return annualInterestRate;
   }
   public void setAnnualInterestRate(double annualInterestRate) {
       this.annualInterestRate = annualInterestRate;
   }
	public double getMonthlyInterestRate() {
		return annualInterestRate/12.0;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void withdraw(double amount) {
		if(balance>= amount)
		{
			balance-=amount;
			
		}
		else {
			
			System.out.print("balance less than amount");
		}
		
	}
	public void deposit (double amount) {
		 balance+=amount;
		
	}
	
}
