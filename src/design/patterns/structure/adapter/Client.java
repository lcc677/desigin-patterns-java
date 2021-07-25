package design.patterns.structure.adapter;

public class Client {
    public static void main(String[] args) {
        // 中国插头,要插中国的插座
        ChineseSocket socket = new ForeignSocketAdapter();

        socket.setChinesePlug();

    }
}
