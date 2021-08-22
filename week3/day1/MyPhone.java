package week3.day1;

public class MyPhone {

	public static void main(String[] args) {
		Android andObj = new Android();
		andObj.sendMsg();
		andObj.makeCall();
		andObj.saveContact();
		andObj.takeVideo();
		
		System.out.println("******Multiple Inheritance**********");
		SmartPhone smrtPhon = new SmartPhone();
		smrtPhon.takeVideo();
		smrtPhon.sendMsg();
		smrtPhon.connectWhatsApp();
		smrtPhon.makeCall();
		smrtPhon.saveContact();

	}

}
