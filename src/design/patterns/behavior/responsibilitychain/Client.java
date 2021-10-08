package design.patterns.behavior.responsibilitychain;

public class Client {
	public static void main(String[] args) {
		AuthenticationHandler authenticationHandler = new AuthenticationHandler();
		JurisdictionHandler jurisdictionHandler = new JurisdictionHandler();
		
		authenticationHandler.setNextHandler(jurisdictionHandler);
		
		boolean isOk = authenticationHandler.process(30);
		if (isOk) {
			System.out.println("我处理成功了！！");
		}else {
			// 我们可以抛出异常，不同的hanler抛出不同错误，我们可以处理不同的错误，知道不同的错误
			// w我们也可以返回一个结果。在结果中记录一些信息用于标记是哪个handler出问题了。
			System.out.println("我处理失败了！！");
		}
		
	}
}
