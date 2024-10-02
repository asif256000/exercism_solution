public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double rate = 1.0;
        int speedRate = 221;
        if (speed > 0 && speed <= 4) {
            rate = 1.0;
        } else if (speed >= 5 && speed <= 8) {
            rate = 0.9;
        } else if (speed == 9) {
            rate = 0.8;
        } else {
            rate = 0.77;
        }
        return rate * speedRate * speed;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
