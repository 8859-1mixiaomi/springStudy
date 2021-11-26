package pojo;

/**
 * 即代理角色
 * @author xiaomi
 */
public class Proxy implements Rent {

    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    //租房
    public void rent() {
        seeHouse();
        host.rent();
        fare();
    }

    //看房
    public void seeHouse(){
        System.out.println("带着客户去看房子");

    }

    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }



}
