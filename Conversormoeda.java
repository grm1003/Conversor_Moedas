import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JOptionPane;


public class Conversormoeda {
    public static double converte(double a, String moedain, String moedaout) throws IOException {
        double valor = 0;
        if (a < 0) throw new IllegalArgumentException(JOptionPane.showInputDialog(null, "Valor inválido"));
        if (moedain == "Dolar") {
            valor = a;
        }
        if (moedain == "Euro") {
            valor = a * realtime("EUR", "USD");
        }
        if (moedain == "Peso Argentino") {
            valor = a * 0.0078;
        }
        if (moedain == "Peso Chileno") {
            valor = a * 0.0011;
        }
        if (moedain == "Real") {
            valor = a * realtime("BRL", "USD");
        }
        if (moedain == "Libra Esterlina") {
            valor = a * 1.2;
        }

        double output = converteDolar(valor, moedaout);


        return output;
    }

    public static double converteDolar(double b, String moedaout) throws IOException {
        double valorconvertido = 0;
        if (moedaout == "Dolar") {
            valorconvertido = b;
        }
        if (moedaout == "Euro") {
            valorconvertido = b * realtime("USD", "EUR");
        }
        if (moedaout == "Peso Argentino") {
            valorconvertido = b / 0.0078;
        }
        if (moedaout == "Peso Chileno") {
            valorconvertido = b / 0.0011;
        }
        if (moedaout == "Real") {
            valorconvertido = b * realtime("USD", "BRL");
        }
        if (moedaout == "Libra Esterlina") {
            valorconvertido = b / 1.2;
        }

        return valorconvertido;
    }

    public static double realtime(String in, String out) throws IOException {
        String GET_URL = "https://economia.awesomeapi.com.br/" + in + "-" + out + "/1?format=moeda";
        URL url = new URL(GET_URL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP Error code : "
                    + conn.getResponseCode());
        }
        InputStreamReader enter = new InputStreamReader(conn.getInputStream());
        BufferedReader br = new BufferedReader(enter);
        String output;

        StringBuffer response = new StringBuffer();
        while ((output = br.readLine()) != null) {
            response.append(output);

        }
        br.close();
        String[] teste = response.toString().replace("[", "").replace("{", "").split(",");
        String[] trabalhoso = teste[3].split(":");
        String valor = trabalhoso[1];
        String a = valor.substring(1, valor.length() - 1);
        double n = Double.parseDouble(a);
        return n;
    }
}