import java.util.Map;

public record RespostaAPI(Map<String, Double> conversion_rates) {
    @Override
    public String toString() {
        return "RespostaAPI{" +
                "conversion_rates=" + conversion_rates +
                '}';
    }
}
