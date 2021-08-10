package week1.day2;

public class MyMobile {

	char color = 'Y';
	public void makeCall() {
		System.out.println("To make a call");
	}

	public void sendMsg() {
		System.out.println("To send a msg");
	}

	private void payMoney() {
		System.out.println("To make a payment");
	}

	public static void main(String[] args) {

		MyMobile mobObj = new MyMobile();
		mobObj.sendMsg();
		mobObj.makeCall();
		mobObj.payMoney();
	}

}
