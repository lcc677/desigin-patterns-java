package design.patterns.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * description: ActiveFactory
 * date: 2021/9/13 下午9:13
 * author: cc
 */
public class ActiveFactory {
    static public Map<Long, Active> activeMap = new HashMap<Long, Active>();

    public static Active getActive(Long id) {
        Active active = activeMap.get(id);
        if (null == active) {
            active = new Active(id, "跳楼活动", "大甩卖！！！！");
            activeMap.put(id,active);
        }
        return active;

    }
}
