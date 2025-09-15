package web.model;



public class Car {


    private String model;

    private int maxSpeed;

    private boolean isElectric;

    public Car(String model, int maxSpeed, boolean isElectric) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.isElectric = isElectric;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", isElectric=" + isElectric +
                '}';
    }
}
