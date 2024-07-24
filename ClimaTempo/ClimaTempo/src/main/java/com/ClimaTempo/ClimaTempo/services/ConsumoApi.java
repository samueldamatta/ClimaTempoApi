package com.ClimaTempo.ClimaTempo.services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.ClimaTempo.ClimaTempo.Principal.DadosClima;
import com.fasterxml.jackson.databind.ObjectMapper;



public class ConsumoApi {
    DadosClima obterDados = new DadosClima();
        public DadosClima obterDados(String endereco) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = null;
            
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper mapper = new ObjectMapper();
            obterDados = mapper.readValue(response.body(), DadosClima.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return obterDados;
    }
}
