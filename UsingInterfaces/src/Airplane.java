public class Airplane implements Movable, Machine{
	private boolean engineOn;
	public Airplane(){
		engineOn = false;
	}
	public void moveUp(){
		if(engineOn == true){
			System.out.println("Rising altitude of plane.");
		}
		else{
			System.out.println("Plane can't move. Turn on engine first");
		}
	}
	public void moveDown(){
		if(engineOn == true){
			System.out.println("Decreasing altitude of plane.");
		}
		else{
			System.out.println("Plane can't move. Turn on engine first");
		}
	}
	public void turnOn(){
		System.out.println("Turning on airplane engine");
		engineOn = true;
	}
	public void turnOff(){
		System.out.println("Turning off airplane engine");
		engineOn = false;
	}
}
