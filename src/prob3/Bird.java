package prob3;

public abstract class Bird 
{
	private String name;
	
	//getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 추상메소드
	public abstract void fly();
	
	public abstract void sing();
	
}
