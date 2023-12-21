package Carro;
public class Car{

	private Engine engine;

	public Car(){
		this.engine = new Engine();	
	}

	public void go(){
		engine.on();
	}

	public void stop(){
		 engine.off();
	}

	public Engine getEngine(){
		return this.engine;
	}

	public void setEngine(Engine engine){
		this.engine = engine;
	}
}
