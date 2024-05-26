public class Main {
    public static void main(String[] args) {
        // Crea una instancia de WeatherStation
        WeatherStation weatherStation = new WeatherStation();

        // Crea instancias de los observadores y agrégalos a la estación meteorológica
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        WeatherWarning weatherWarning = new WeatherWarning();

        weatherStation.addObserver(temperatureDisplay);
        weatherStation.addObserver(weatherWarning);

        // Cambia la temperatura de la estación dos veces
        weatherStation.setTemperature(25);
        weatherStation.setTemperature(35);
    }
}