package transport;

public class Bus extends Transport<DriverD> {

    public Bus(String brand,
               String model,
               double engineVolume,
               DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус начал движение (марки " + getBrand() +
                " модели " + getModel() +
                " с объемом двигателя " + getEngineVolume() + ")");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автобус закончил движение (марки " + getBrand() +
                " модели " + getModel() +
                " с объемом двигателя " + getEngineVolume() + ")");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автобуса");
    }

    @Override
    public void bestLapTime() {
        int minTime = 5;
        int maxTime = 40;
        int bestLapTime = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println("Лучшее время круга у автобуса = " + bestLapTime + " мин");
    }

    @Override
    public void maxSpeed() {
        int minSp = 40;
        int maxSp = 130;
        int maxSpeed = (int) (minSp + (maxSp - minSp) * Math.random());
        System.out.println("Максимальная скорость для автобуса = " + maxSpeed + " км/ч");
    }
}