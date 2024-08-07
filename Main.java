public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         account A1=new account(1122,20000.0);
         A1.setAnnualInterestRate(4.5);
         A1.withdraw(2500);
         A1.deposit(3000);
         System.out.println("Balance is " + A1.getBalance());
         System.out.println("Monthly interest is " +
         A1.getMonthlyInterestRate());
         System.out.println("This account was created at " +
         A1.getDateCreated());
	}
}
