package Domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.support.NullValue;

import java.util.*;


public class Student {

    private String name;

    private Address address;
    private String[] books;
    private List<String> body;
    private Map<String, String> card;
    private Set<String> games;
    private String wife;
    private Properties info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getBody() {
        return body;
    }

    public void setBody(List<String> body) {
        this.body = body;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public Student() {
    }

    public Student(String name, Address address, String[] books, List<String> body, Map<String, String> card, Set<String> games, String wife, Properties info) {
        this.name = name;
        this.address = address;
        this.books = books;
        this.body = body;
        this.card = card;
        this.games = games;
        this.wife = wife;
        this.info = info;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", address=").append(address);
        sb.append(", books=").append(books == null ? "null" : Arrays.asList(books).toString());
        sb.append(", body=").append(body);
        sb.append(", card=").append(card);
        sb.append(", games=").append(games);
        sb.append(", wife='").append(wife).append('\'');
        sb.append(", info=").append(info);
        sb.append('}');
        return sb.toString();
    }

    public void show(){
        System.out.println("name"+name+"Address="+address.getAddress()+"books=");
        for (String book : books) {
            System.out.println("<<"+book+">>");
        }
        System.out.println("爱好："+body);
        System.out.println("card："+card);
        System.out.println("games："+games);
        System.out.println("wife："+wife);
        System.out.println("info："+info);
    }




}
