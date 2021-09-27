package design.patterns.behavior.visitor;

import java.util.ArrayList;

/**
 * description: ObjectStructure
 * date: 2021/9/27 下午9:28
 * author: cc
 */
public class ObjectStructure {
    ArrayList<Staff> staffs = new ArrayList<Staff>();

    public ObjectStructure() {

        staffs.add(new Programmer("程序-张三",90,15));
        staffs.add(new Programmer("程序-李四",80,10));
        staffs.add(new Programmer("程序-王二麻",96,25));

        staffs.add(new ProductManager("产品-张三",92,14));
        staffs.add(new ProductManager("产品-李四",81,13));
        staffs.add(new ProductManager("产品-王二麻",99,30));

        staffs.add(new Tester("测试-张三",92,14));
        staffs.add(new Tester("测试-李四",81,13));
        staffs.add(new Tester("测试-王二麻",99,30));



    }

    public void CEOShow(CEOVisitor visitor){
        for(Staff staff:staffs){
            staff.accept(visitor);
        }
        System.out.println("-----------------------------------");
        System.out.println("所有人的绩效总和是" + visitor.getPerformance());

    }
    public void CTOShow(CTOVisitor visitor){
        for(Staff staff:staffs){
            staff.accept(visitor);
        }
        System.out.println("-----------------------------------");
        System.out.println("总bug:" + visitor.getBugTotal());
        System.out.println("总任务:" + visitor.getTaskTotal());
        System.out.println("总pr:" + visitor.getPrTotal());
    }
}
