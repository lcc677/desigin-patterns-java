package design.patterns.behavior.command;

public class Light {
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public void on(){
		System.out.println("----电灯开了-");
	}
	public void off(){
		System.out.println("----电灯关了-");
	}
}
