public class ElectricityBill {
    private int consumerNumber;
    private String consumerName;
    private int previousReading;
    private int currentReading;

    public ElectricityBill(int consumerNumber, String consumerName, int previousReading, int currentReading) {
        this.consumerNumber = consumerNumber;
        this.consumerName = consumerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
    }

    public int getUnitsConsumed() {
        return currentReading - previousReading;
    }

    public double computeBill() {
        int units = getUnitsConsumed();
        double billAmount = 0;

        if (units <= 100) {
            billAmount = units * 1.0;
        } else if (units <= 200) {
            billAmount = 100 * 1.0 + (units - 100) * 2.5;
        } else if (units <= 500) {
            billAmount = 100 * 1.0 + 100 *  2.5 + (units - 200) * 4.0;
        } else {
            billAmount = 100 * 1.0 + 100 * 2.5 + 300 * 4.0 + (units - 500) * 6.0;
        }

        return billAmount;
    }

    public void printBill() {
        System.out.println("Consumer Number: " + consumerNumber);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Previous Reading: " + previousReading);
        System.out.println("Current Reading: " + currentReading);
        System.out.println("Units Consumed: " + getUnitsConsumed());
        System.out.println("Total Bill Amount: Rs " + computeBill());
    }

    public static void main(String[] args) {
        ElectricityBill bill = new ElectricityBill(12345, "John Doe", 500, 750);
        bill.printBill();
    }
}
