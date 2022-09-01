import java.util.ArrayList;
import java.util.List;

public class Counter {
    private int automobile_toll = 10;
    private int minibus_toll = 20;
    private int bus_toll = 30;
    private List vehicle_array = new ArrayList<Vehicle>();

    public int getAutomobile_toll() {
        return automobile_toll;
    }

    public void setAutomobile_toll(int automobile_toll) {
        this.automobile_toll = automobile_toll;
    }

    public int getMinibus_toll() {
        return minibus_toll;
    }

    public void setMinibus_toll(int minibus_toll) {
        this.minibus_toll = minibus_toll;
    }

    public int getBus_toll() {
        return bus_toll;
    }

    public void setBus_toll(int bus_toll) {
        this.bus_toll = bus_toll;
    }

    public List getVehicle_array() {
        return vehicle_array;
    }

    public void payment(Vehicle v){
        switch (v.getVehicle_class()){
            case 1:
                vehicle_array.add(v);
                if (v.getBalance() - automobile_toll > 0){
                    v.setBalance(v.getBalance() - automobile_toll);
                } else {
                    v.setBalance(0);
                    System.out.println("Insufficient Balance!");
                }
                break;
            case 2:
                vehicle_array.add(v);
                if (v.getBalance() - minibus_toll > 0){
                    v.setBalance(v.getBalance() - minibus_toll);
                } else {
                    v.setBalance(0);
                    System.out.println("Insufficient Balance!");
                }
                break;
            case 3:
                vehicle_array.add(v);
                if (v.getBalance() - bus_toll > 0){
                    v.setBalance(v.getBalance() - bus_toll);
                } else {
                    v.setBalance(0);
                    System.out.println("Insufficient Balance!");
                }
                break;
            default:
                System.out.println("Invalid Transaction!");
                break;
        }
    }
}
