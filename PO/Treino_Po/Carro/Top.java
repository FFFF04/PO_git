package Carro;
public class Top extends Mid{
	
	private Xtrme x;

	public void add(Xtrme x){
		this.x = x;
	}
	@Override
	public void go(){
		if (this.x != null)
			this.x.on();
		super.go();
	}
	@Override
	public void stop(){
		if(this.x != null)
			this.x.off();
		super.stop();
	}
}
