package design.patterns.behavior.iterator.system;

/**
 * description: 菜单
 * date: 2021/7/31 下午4:00
 * author: cc
 */
public class Menu {
    private String name;
    private String description;
    private float price;

    public Menu(String name, String description, float price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
