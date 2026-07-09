public class HourlyPricingStrategy implements PricingStrategy {

    @Override
    public double calculate(long duration) {

        long hours = duration / (1000 * 60 * 60);

        if (hours == 0) {
            hours = 1;
        }

        return hours * 20;
    }
}