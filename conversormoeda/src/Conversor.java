import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    public static double obterTaxaDeConversao(String moedaOrigem, String moedaDestino) {

        URI enderecoUri =URI.create("https://v6.exchangerate-api.com/v6/3cd55afcbea1632092e5fa0d/latest/USD");


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(enderecoUri)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            RespostaAPI resposta = new Gson().fromJson(response.body(), RespostaAPI.class);
            return resposta.conversion_rates().get(moedaDestino);

        }

        catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error");
        }
    }

}