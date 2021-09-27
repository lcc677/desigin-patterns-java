package design.patterns.behavior.visitor;

/**
 * description: Client
 * date: 2021/9/27 下午9:38
 * author: cc
 */
public class Client {
    public static void main(String[] args) {
        CTOVisitor ctoVisitor = new CTOVisitor();
        CEOVisitor ceoVisitor = new CEOVisitor();

        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.CEOShow(ceoVisitor);
        objectStructure.CTOShow(ctoVisitor);
    }
}
