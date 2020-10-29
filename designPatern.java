class Demo {

    public static void main(String[] args) {
        Vehicle vehicleObj = Vehicle.getInstance();
        vehicleObj.showSomeText();
    }
}

class Vehicle {
    private Vehicle() {
    }

    private static Vehicle instance = new Vehicle();

    public static Vehicle getInstance() {
        return instance;
    }

    public void showSomeText() {

        System.console().writer().println("some text function call");
    }

}
