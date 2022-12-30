public class Calculation implements Runnable {

    double radius, side, area;
    double phi = 3.14;

    @Override
    public void run() {
        System.out.println("Program will start in");
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Error occurred");
            }
        }
        System.out.println("Program has started");
    }

    public void setSquare(double side) throws IllegalArgumentException {

        if (side < 1) {
            throw new IllegalArgumentException("Luas sisi tidak boleh kurang dari satu");
        }
        this.area = side * side;
    }

    public double getSquare() {
        return this.area;
    }

    public void setCircle(double radius) throws IllegalArgumentException {

        if (radius < 1) {
            throw new IllegalArgumentException("Luas radius tidak boleh kurang dari satu");
        }
        this.area = phi * radius * radius;
    }

    public double getCircle() {
        return this.area;
    }

    public void setTrapezoid(double a, double b, double t) throws IllegalArgumentException {
        if (a < 1 || b < 1 || t < 1) {
            throw new IllegalArgumentException("Sisi tidak boleh kurang dari satu");
        }
        this.area = ((a + b) * t) / 2;
    }

    public double getTrapezoid() {
        return this.area;
    }

}
