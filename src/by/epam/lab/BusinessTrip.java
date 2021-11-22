package by.epam.lab;

public class BusinessTrip {
    private final int RATE = 700;
    private String account;
    private int transport;
    private int days;

    public BusinessTrip() {
    }

    public BusinessTrip(String account, int transport, int days) {
        this.account = account;
        this.transport = transport;
        this.days = days;
    }

    public int getRATE() {
        return RATE;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getTransport() {
        return transport;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String transform(int value){
        return String.format("%d.%02d", value / 100, value % 100);
    }

    public int getTotal(){
        return transport + days * RATE;
    }

    public void show(){
        System.out.printf("rate = " + RATE + "\n");
        System.out.printf("accout = " + account + "\n");
        System.out.printf("transport = " + transport + "\n");
        System.out.printf("days = " + days + "\n");
        System.out.printf("total = " + getTotal() + "\n");
    }

    @Override
    public String toString() {
        return (account + ";" + transform(transport) + ";" + days + ";" + transform(getTotal()));
    }
}
