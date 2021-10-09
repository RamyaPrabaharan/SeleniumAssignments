package week1.day2;

public class MyMobile {

	int weight = 15;
	String brandname;

	public void makecalls() {
		System.out.println("To make calls");
	}

	public void viewgallery() {
		System.out.println("To view Pictures");
	}

	private void paybills() {
		System.out.println("To Pay all Bills");
	}

	public static void main(String[] args) {
		MyMobile myobj = new MyMobile();
		myobj.brandname = "Apple";
		myobj.makecalls();
		myobj.viewgallery();
		myobj.paybills();
		System.out.println("Mobile Weight: " + myobj.weight);
		System.out.println("Brand Name: " + myobj.brandname);
	}
}
