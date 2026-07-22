class Solution {
    public double[] convertTemperature(double celsius) {
        double k = (double) celsius + 273.15;
        double f = (double) celsius * 1.80 + 32.00;
        double[] ans = {k,f};
        return ans;
    }
}