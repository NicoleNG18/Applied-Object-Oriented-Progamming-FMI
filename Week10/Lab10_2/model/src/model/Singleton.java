package model;

public class Singleton {
    private String data;

    private static final Singleton instance = new Singleton("singleton data");

    private Singleton(String data) {
        setData(data);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static Singleton getInstance() {
        return instance;
    }
}
