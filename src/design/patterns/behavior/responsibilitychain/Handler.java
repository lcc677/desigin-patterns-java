package design.patterns.behavior.responsibilitychain;

public interface Handler {
	// request 请求。用int来模拟一下吧
	public boolean process(int request);
}
