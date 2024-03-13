
package Equipment;
    private String brandName;
    private double gain;
    private double cost;

    public Equipment(String brandName, double gain, double cost) {
        this.brandName = brandName;
        this.gain = gain;
        this.cost = cost;
    }

    public double getROI() {
        return (gain - cost) / cost;
    }

    public String toString() {
        return "Brand Name: " + brandName + "\n" +
                "Gain: " + gain + "\n" +
                "Cost: " + cost + "\n" +
                "ROI: " + getROI() + "\n";
    }
}
