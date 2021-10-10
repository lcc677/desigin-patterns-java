package design.patterns.behavior.mediator;

public class Client {
	public static void main(String[] args) {
		Person person1 = new Seller("张三");
		Person person2 = new Buyer("李四");
		Person person3 = new Buyer("王二麻");
		
		Mediator mediator = new ConcreteMediator();
		
		mediator.register(person1);
		mediator.register(person2);
		mediator.register(person3);
		
		
	}

}
