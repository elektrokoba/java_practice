public class Dog{
	int color;
	String breed;
	int age;
	boolean alive;
	
	//konstruktor
	public Dog(int color, String breed, int age){
		this.color = color;
		this.breed = breed;
		this.age = age;
		this.alive = true;
		System.out.println(color + " " + breed + " " + age);
	}
	
	
	public void bark(String bark_type){
		System.out.println(bark_type);
	}
	
	public void kill(){
		alive = false;
		
		if(alive == true) {
			System.out.println(color + " él");
		} else {
			System.out.println(color + " halott");
		}
	}
}
