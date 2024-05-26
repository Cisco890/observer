public class WeatherWarning implements Observer {
    private static final int THRESHOLD = 30; // Umbral de temperatura para la advertencia

    @Override
    public void update(int temperature) {
        if (temperature > THRESHOLD) {
            System.out.println("Weather Warning: High Temperature Alert!");
        }
    }
}