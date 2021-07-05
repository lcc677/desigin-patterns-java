package design.patterns.creator.factory.commonImplement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String orderType = "";
        do {
            orderType = getType();
            if(orderType.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName("greek");
            }else if (orderType.equals("chesse")){
                pizza = new CheesePizza();
                pizza.setName("chesse");
            }else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    public String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入pizza类型");
            String type = strin.readLine();
            return type;
        } catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
