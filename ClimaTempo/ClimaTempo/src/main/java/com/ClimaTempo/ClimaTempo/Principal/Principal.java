package com.ClimaTempo.ClimaTempo.Principal;

import java.util.Scanner;
import com.ClimaTempo.ClimaTempo.services.ConsumoApi;

public class Principal {
        ConsumoApi consumo = new ConsumoApi();
        String URL_BASE = "http://api.weatherapi.com/v1/current.json?key=4c233887e7a940b0b9004503241607&q=";
        String endereco;
        Scanner leitura = new Scanner(System.in);
        
}
