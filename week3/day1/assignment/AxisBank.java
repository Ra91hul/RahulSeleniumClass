package week3.day1.assignment;

public class AxisBank extends BankInfo {

	@Override
	public void deposit() {
		System.out.println("This is Axis Bank Savings Account");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank ax = new AxisBank();
		ax.deposit();
		ax.fixed();

	}

}
