package week1.day2;

public class MyKids {

	public static void main(String[] args) {
		
		MyMobile obj1=new MyMobile();
		obj1.brandname="OnePlus";
		obj1.makecalls();
		obj1.viewgallery();
		//obj1.paybills();
		//Unable toacess paysbill Since its access specifier is private
		System.out.println("Mobile Weight " +obj1.weight);
		System.out.println("Brand Name: " +obj1.brandname);	}

}
