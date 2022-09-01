public class Administration {
    private Counter counter;

    public Administration() {
    }

    public Administration(Counter counter) {
        this.counter = counter;
    }

    public void print_total_balance(){
        int total_balance = 0;
        for (int i = 0; i < counter.getVehicle_array().size(); i++){
            switch (((Vehicle)counter.getVehicle_array().get(i)).getVehicle_class()){
                case 1:
                    total_balance += counter.getAutomobile_toll();
                    break;
                case 2:
                    total_balance += counter.getMinibus_toll();
                    break;
                case 3:
                    total_balance += counter.getBus_toll();
                    break;
            }
        }
        System.out.println("Total balance = " + total_balance);
    }
}
