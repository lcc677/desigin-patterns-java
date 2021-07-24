package design.patterns.behavior.command;

public class Light {
	private String description;

	public Light(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public void on(){
		System.out.println(description + " ----电灯开了-");
	}
	public void off(){
		System.out.println(description + " ----电灯关了-");
	}
}
