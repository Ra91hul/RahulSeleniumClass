package week1.day2;

public class MyKid {

	public static void main(String[] args) {
		MyMobile kidObj = new MyMobile();
		char color = kidObj.color;
		System.out.println("The Mobile color is " + color);
		kidObj.sendMsg();
		kidObj.makeCall();
		// kidObj.payMoney();

	}

}
