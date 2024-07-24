package com.ClimaTempo.ClimaTempo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
import com.ClimaTempo.ClimaTempo.services.ConsumoApi;

@SpringBootApplication
public class ClimaTempoApplication implements CommandLineRunner{
	public static void main(String[] args) {
		SpringApplication.run(ClimaTempoApplication.class, args);
	}

	@Override
    public void run(String... args) throws Exception {
		ConsumoApi consumo = new ConsumoApi();
        String URL_BASE = "http://api.weatherapi.com/v1/current.json?key=4c233887e7a940b0b9004503241607&q=";
        String endereco;
        Scanner leitura = new Scanner(System.in);
		

        try {
            System.out.println("Digite uma cidade para saber o clima: ");
            String cidade = leitura.nextLine().toLowerCase().replace(" ", "-");
            endereco = URL_BASE + cidade + "&aqi=no";
            var json = consumo.obterDados(endereco);

            System.out.println(json);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } finally {
            leitura.close();
        }
    }
}
