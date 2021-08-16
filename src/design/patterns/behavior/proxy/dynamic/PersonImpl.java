package design.patterns.behavior.proxy.dynamic;

/**
 * description: PersonImpl
 * date: 2021/8/16 下午7:41
 * author: cc
 */
public class PersonImpl implements Person{
    String name;
    String gender;
    String interests;
    int rating;
    int ratingCount;

    public PersonImpl(String name, String gender, String interests) {
        this.name = name;
        this.gender = gender;
        this.interests = interests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public int getHotOrNotRating() {
        if (ratingCount == 0) {
            return 0;
        } else {
            return rating / ratingCount;
        }
    }

    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }
}
