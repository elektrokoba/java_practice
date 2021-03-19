
public class Car {
	int color;
	int doorcount;
	int pos_x;
	int pos_y;
	String manufacturer;
	
	public Car(String manufacturer, int pos_x, int pos_y ) {
		this.manufacturer=manufacturer;
		this.pos_x=pos_x;
		this.pos_y=pos_y;
	}

	public void move(int x, int y){
		this.pos_x+=x;
		this.pos_y+=y;
		System.out.println(this.pos_x + " " + this.pos_y);
	}
	
	public void hit(Dog dog){
		System.out.println(this.manufacturer + " elüti a kutyát");
		dog.kill();
	}
}
