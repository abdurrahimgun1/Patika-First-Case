public class Automobile extends Vehicle{
    private int HGS_number;
    private String owner_name;
    private String owner_surname;
    private int vehicle_class = 1;
    private String date;
    private String hour;

    public Automobile() {
    }

    public int getHGS_number() {
        return HGS_number;
    }

    public void setHGS_number(int HGS_number) {
        this.HGS_number = HGS_number;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getOwner_surname() {
        return owner_surname;
    }

    public void setOwner_surname(String owner_surname) {
        this.owner_surname = owner_surname;
    }

    public int getVehicle_class() {
        return vehicle_class;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public int getBalance() {
        return super.getBalance();
    }

    public void setBalance(int balance) {
        super.setBalance(balance);
    }



}
