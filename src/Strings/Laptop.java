package Strings;

public class Laptop {

	void turnOn() {
		System.out.println("on");
	};
	
	
	public static void main(String[] args) {
		Laptop lenova = new Lenova();
		lenova.turnOn();
	}
	
	
}

class Lenova extends Laptop {
	void turnOn() {
		System.out.println("lenova on");
	};

}

class Hp extends Laptop {
	void turnOn() {
		System.out.println("hp on");
	};
}




