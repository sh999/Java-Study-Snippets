public class UsingInterfaces {
	public static void main(String[] args){
		Person bob = new Person();
		Airplane boeing = new Airplane();
		boeing.turnOn();
		boeing.turnOff();
		bob.moveUp();
		boeing.moveUp();
		bob.moveDown();
		boeing.turnOn();
		boeing.moveDown();
	}
}
