package design.patterns.behavior.responsibilitychain;

public class AuthenticationHandler implements Handler{
	public Handler nextHandler;

	@Override
	public boolean process(int request) {
		// TODO Auto-generated method stub
		System.out.println("我在走认证权限逻辑~~~");
		if(null == nextHandler) {
			return false;
		}
		return nextHandler.process(request);
	}

	public Handler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	

}
