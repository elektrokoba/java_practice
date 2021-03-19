
public class Main {
	public static void main (String[] args) {
		Car a = new Car("opel", 12, 11);
		Car b = new Car("as", 16, 31);
		Dog puli = new Dog(123, "hanyi", 34);
		a.move(3, 2);
		b.hit(puli);
	}	
}