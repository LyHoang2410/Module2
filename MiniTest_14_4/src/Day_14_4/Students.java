package Day_14_4;

public class Students extends People{
private double avgPoint;

    public Students() {
    }

    public Students(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    public Students(String name, int age, double avgPoint) {
        super(name, age);
        this.avgPoint = avgPoint;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }


    @Override
    public String toString() {
        return super.toString() +
                "avgPoint=" + avgPoint +
                '}';
    }
}
