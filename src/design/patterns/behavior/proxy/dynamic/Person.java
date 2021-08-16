package design.patterns.behavior.proxy.dynamic;

/**
 * description: Person
 * date: 2021/8/16 下午7:08
 * author: cc
 */
public interface Person {
    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);

}
