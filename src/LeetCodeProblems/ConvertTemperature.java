package LeetCodeProblems;

public class ConvertTemperature {
    public static void main(String[] args) {}

    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32;
        double[] temperature = {kelvin,fahrenheit};
        return temperature;

}}