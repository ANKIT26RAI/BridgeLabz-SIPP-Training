package inheritance.SampleProblem2;

public class Thermostat extends Device {
    int temperatureSetting;

    public Thermostat(String deviceId, String status, int temp) {
        super(deviceId, status);
        this.temperatureSetting = temp;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status + ", Temperature: " + temperatureSetting + "°C");
    }

    public static void main(String[] args) {
        Thermostat t = new Thermostat("TH123", "Online", 24);
        t.displayStatus();
    }
}
