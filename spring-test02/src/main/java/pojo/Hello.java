package pojo;

/**
 * @author xiaomi
 */
public class Hello {
    private String id;
    private String name;
    private int age;
    private int sex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hello{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", sex=").append(sex);
        sb.append('}');
        return sb.toString();
    }

    public Hello(String id, String name, int age, int sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Hello() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hello)) return false;

        Hello hello = (Hello) o;

        if (age != hello.age) return false;
        if (sex != hello.sex) return false;
        if (id != null ? !id.equals(hello.id) : hello.id != null) return false;
        return name != null ? name.equals(hello.name) : hello.name == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + sex;
        return result;
    }

    public void show(){
        System.out.println("hello spring...");
    }

}

