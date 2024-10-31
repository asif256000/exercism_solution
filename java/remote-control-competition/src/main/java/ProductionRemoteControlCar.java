class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int unitDistanceTravel = 10;
    private int totalDistanceTravelled = 0;
    private int numberOfVictories = 0;

    public void drive() {
        totalDistanceTravelled += unitDistanceTravel;
    }

    public int getDistanceTravelled() {
        return totalDistanceTravelled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }


    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return o.numberOfVictories - this.numberOfVictories;
    }
}
