public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int unitDistanceTravelled = 20;
    private int totalDistanceTravelled = 0;

    public void drive() {
        totalDistanceTravelled += unitDistanceTravelled;
    }

    public int getDistanceTravelled() {
        return totalDistanceTravelled;
    }
}
