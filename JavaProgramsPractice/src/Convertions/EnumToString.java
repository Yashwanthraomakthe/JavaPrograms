package Convertions;

public class EnumToString {

	enum Fruits {
		Orange, Apple, Banana, Mango;
	}

	public static void UsingNameMethod() {
		System.out.println(Fruits.Orange.name());
		System.out.println(Fruits.Apple.name());
		System.out.println(Fruits.Banana.name());
		System.out.println(Fruits.Mango.name());
	}

	public static void UsingToStringMethod() {
		System.out.println(Fruits.Orange.toString());
		System.out.println(Fruits.Apple.toString());
		System.out.println(Fruits.Banana.toString());
		System.out.println(Fruits.Mango.toString());
	}

	public static void main(String[] args) {
		UsingNameMethod();
		System.out.println("-----------------------------------");
		UsingToStringMethod();

	}

}
