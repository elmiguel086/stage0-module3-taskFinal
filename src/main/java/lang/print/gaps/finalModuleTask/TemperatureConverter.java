package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float tem = temperatureCelsius;
        System.out.printf("%.1f\n",(tem*9/5)+32);
    }
}
