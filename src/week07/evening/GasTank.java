package week07.evening;

public class GasTank {

    public double amount;
    public double capacity; // 50 gallon

    public GasTank(double amount, double capacity) {
        this.amount = amount;
        this.capacity = capacity;
    }

    public void addGas (double amountOfGas) {
        if (amount + amountOfGas < capacity) {
            amount += amountOfGas;
        } else {
            amount = capacity;

        }
    }
}


