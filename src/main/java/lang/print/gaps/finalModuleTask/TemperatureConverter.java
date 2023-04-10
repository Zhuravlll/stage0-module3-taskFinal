package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public static void main(String[] args) {
        int a = 1;
        toFahrenheit(a);
    }
    public static void toFahrenheit(float temperatureCelsius){
        float result = (temperatureCelsius * 9 / 5) + 32;
        System.out.println(result);
    }
}
