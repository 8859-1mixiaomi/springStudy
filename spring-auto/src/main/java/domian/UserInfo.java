package domian;

import javax.annotation.Resource;

public class UserInfo {
    //如果允许对象为null，设置required = false,默认为true
    @Resource
    private Cat cat;
    @Resource
    private Dog dog;

    private String str;

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
